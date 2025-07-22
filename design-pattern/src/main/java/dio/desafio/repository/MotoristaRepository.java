package dio.desafio.repository;

import dio.desafio.model.Motorista;
import dio.desafio.service.MotoristaService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, String> {
    MotoristaService findByCnh(String cnh);
}

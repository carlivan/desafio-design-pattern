package dio.desafio.service.impl;

import dio.desafio.model.Motorista;
import dio.desafio.service.MotoristaService;
import org.springframework.stereotype.Service;

@Service
public class MotoristaServiceImpl implements MotoristaService {
    @Override
    public Iterable<MotoristaService> findAll() {
        return null;
    }

    @Override
    public Motorista findByCnh(String cnh) {
        return null;
    }

    @Override
    public void inserir(Motorista motorista) {

    }

    @Override
    public void atualizar(String cnh, Motorista motorista) {

    }

    @Override
    public void deletar(String cnh) {

    }
}

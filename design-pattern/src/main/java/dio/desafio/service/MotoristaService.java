package dio.desafio.service;

import dio.desafio.model.Motorista;

public interface MotoristaService {
    Iterable<MotoristaService> findAll();

    Motorista findByCnh(String cnh);

    void inserir(Motorista motorista);

    void atualizar(String cnh, Motorista motorista);

    void deletar(String cnh);
}

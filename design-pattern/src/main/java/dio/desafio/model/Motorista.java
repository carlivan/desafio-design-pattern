package dio.desafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Motorista {

    @Id
    private String cnh;

    private String nome;

    @ManyToOne
    private Endereco endereco;

    @OneToMany
    private List<Carro> carros;

    public Motorista() {
    }

    public Motorista(String cnh, String nome, Endereco endereco, List<Carro> carros) {
        this.cnh = cnh;
        this.nome = nome;
        this.endereco = endereco;
        this.carros = carros;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}

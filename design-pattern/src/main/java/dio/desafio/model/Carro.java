package dio.desafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codCarro;
    private String marca;
    private String modelo;
    private String ano;

    public Carro() {
    }

    public Carro(Long codCarro, String marca, String modelo, String ano) {
        this.codCarro = codCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Long getCodCarro() {
        return codCarro;
    }

    public void setCodCarro(Long codCarro) {
        this.codCarro = codCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

package dominio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {

    private int idUsr;
    private String nome;
    private String celular;
    private String email;
    private String cep;
    private String cidade;
    private String uf;
    private int numeroCasa;
    private String rua;
    private String bairro;
    private String referencia;

    public Usuario(String nome, String celular, String email, String cep, String cidade, String uf, int numeroCasa, String rua, String bairro, String referencia) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numeroCasa = numeroCasa;
        this.rua = rua;
        this.bairro = bairro;
        this.referencia = referencia;
    }
    
    public String getEndereco(){
        return rua+", Número "+numeroCasa;
    }
}

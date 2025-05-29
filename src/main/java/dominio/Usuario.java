package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsr;
    @Column
    private String nome;
    @Column 
    private String celular;
    @Column
    private String email;
    @Column
    private String cep;
    @Column
    private String cidade;
    @Column (length = 2)
    private String uf;
    @Column 
    private int numeroCasa;
    @Column 
    private String rua;
    @Column 
    private String bairro;
    @Column 
    private String referencia;
    @Column(columnDefinition = "BYTEA")
    private byte[] foto;
    
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Personagem> personagens;
    @OneToMany(mappedBy = "mestre", fetch = FetchType.LAZY)
    private List<Historia> historias;

    public Usuario(String nome, String celular, String email, String cep, String cidade, String uf, int numeroCasa, String rua, String bairro, String referencia, byte[] foto) {
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
        this.foto = foto;
        this.personagens = null;
        this.historias = null;
    }
    
    public String getEndereco(){
        return rua+", Número "+numeroCasa;
    }
    
    public void addPersonagem(Personagem personagem){
        personagens.add(personagem);
    }
}

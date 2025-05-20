package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Historia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idHis;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private int status;
    
    @ManyToOne
    @JoinColumn(name = "idUsr")
    private Usuario mestre;
    @OneToMany(mappedBy = "historia", fetch = FetchType.LAZY)
    private List<Partida> partidas;
    @OneToOne(mappedBy = "historia", cascade = CascadeType.ALL)
    private PersonagensHistoria listaPersonagens;

    public Historia(String nome, String descricao, int status, Usuario mestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
    }
}

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
    @Enumerated(EnumType.STRING)
    private HistoriaStatus status;
    
    @ManyToOne
    @JoinColumn(name = "idUsr")
    private Usuario mestre;
    
    
    @OneToMany(mappedBy = "historia", cascade = CascadeType.ALL)
    private List<PersonagensHistoria> listaPersonagens;

    public Historia(String nome, String descricao, HistoriaStatus status, Usuario mestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
    }

}

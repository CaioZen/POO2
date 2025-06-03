/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;


/**
 *
 * @author 2023122760123
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Partida implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPar;
    @Column
    private int numero;
    @Column
    private String local;
    @Temporal ( value = TemporalType.DATE )
    private Date data;
    @Column
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name = "idHis")
    private Historia historia;
    @ManyToMany
    @JoinTable(name = "PartidaPersonagem", joinColumns = {@JoinColumn(name = "idPar")},
                inverseJoinColumns = { @JoinColumn(name = "idPerHis")})
    private List<PersonagensHistoria> listaPersonagens;

    public Partida(int numero, String local, Date data, String descricao, Historia historia, List<PersonagensHistoria> listaPersonagens) {
        this.numero = numero;
        this.local = local;
        this.data = data;
        this.descricao = descricao;
        this.historia = historia;
        this.listaPersonagens = listaPersonagens;
    }
}

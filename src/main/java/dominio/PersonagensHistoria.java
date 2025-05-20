/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
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
@EqualsAndHashCode(of = {"personagem", "historia"}) //ManyToMany só funciona corretamente com essa Anotação do Lombok
public class PersonagensHistoria implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPerHis;
    
    @ManyToOne
    @JoinColumn(name = "idHis", referencedColumnName = "idHis")
    private Historia historia;
    
    @OneToOne
    @JoinColumn(name = "idPer")
    private Personagem personagem; 
    
    @ManyToMany(mappedBy = "listaPersonagens")
    private List<Partida> partidas;
    
}

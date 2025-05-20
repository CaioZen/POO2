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
public class PersonagensHistoria implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPerHis;
    @OneToOne
    @JoinColumn(name = "idHis", referencedColumnName = "idHis")
    private Historia historia;
    @OneToMany(mappedBy = "listaPersonagensHistoria", cascade = CascadeType.ALL)
    private List<Personagem> personagens; 
    @OneToMany(mappedBy = "listaPersonagens", cascade = CascadeType.ALL)
    private List<Partida> partidas;
    
}

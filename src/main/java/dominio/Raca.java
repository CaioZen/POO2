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
public class Raca implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idRaca;
    @Column
    private String nome;
    @Column
    private String vantagem;
    @Column
    private String habilidadeEspecial;
    @OneToMany (mappedBy = "raca", cascade = CascadeType.ALL)
    private List<SubRaca> subRacas;
    
}

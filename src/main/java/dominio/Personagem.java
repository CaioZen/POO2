/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
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
public class Personagem implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPer;
    @Column
    private String nome;
    @Column
    private int nivel;
    @ManyToOne
    @JoinColumn (name = "idClass")
    private Classe classe;
    @ManyToOne
    @JoinColumn (name = "idSubRaca")
    private SubRaca subRaca;
    @ManyToOne
    @JoinColumn (name = "idAnte")
    private Antecedente antecedente;
    @ManyToOne
    @JoinColumn (name = "idAli")
    private Alinhamento alinhamento;

    public Personagem(String nome, int nivel, Classe classe, SubRaca subRaca, Antecedente antecedente, Alinhamento alinhamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.subRaca = subRaca;
        this.antecedente = antecedente;
        this.alinhamento = alinhamento;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
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
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClass;
    @Column
    private String nome;
    @Column
    private String habilidadeEspecial;
    @Column
    private int qtde;

    @Override
    public String toString() {
        return nome;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author 2023122760123
 */
@Data
@AllArgsConstructor
public class Personagem {
    private int idPer;
    private String nome;
    private int nivel;
    private Classe classe;
    private SubRaca subRaca;
    private Antecedente antecedente;
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

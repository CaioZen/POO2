/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author 2023122760123
 */
@Data
@AllArgsConstructor
public class Partida {
    private int idPar;
    private int numero;
    private String local;
    private Date data;
    private String descricao;
    private Historia historia;

    public Partida(int numero, String local, Date data, String descricao, Historia historia) {
        this.numero = numero;
        this.local = local;
        this.data = data;
        this.descricao = descricao;
        this.historia = historia;
    }
}

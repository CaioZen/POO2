/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author 2023122760123
 */
@Data
@AllArgsConstructor
public class PersonagensHistoria {
    private Historia historia;
    private List<Personagem> personagens; 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dominio.Personagem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Caio
 */
public class TableModelPersonagem extends AbstractTableModel{
    private List listaPer = new ArrayList();


    @Override
    public int getRowCount() {
        return listaPer.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personagem item = (Personagem) listaPer.get(rowIndex);;
        switch (columnIndex) {
            case 0:
                return item.getNome();
            case 1:
                return item.getUsuario().getNome();
            case 2:
                return item.getNivel();
            case 3:
                return item.getClasse();
            case 4:
                return item.getSubRaca();
            case 5:
                return item.getAlinhamento();
            case 6:
                return item.getAntecedente();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Usuario", "Nível", "Classe", "SubRaca", "Alinhamento", "Antecedente"};
        return nomes[column];
    }

    public void remover(int indice) {
        fireTableRowsDeleted(indice, indice);
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaPer.isEmpty() ) {
                listaPer.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaPer = novaLista;
            fireTableRowsInserted( 0, listaPer.size() - 1);
        }
        
    }
    
    public Object getItem (int rowIndex) {
        return listaPer.get(rowIndex);        
    }
}

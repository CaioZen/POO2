/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dominio.Raca;
import dominio.SubRaca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Caio
 */
public class TableModelRaca extends AbstractTableModel {
    private List lista = new ArrayList();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SubRaca ante = (SubRaca) lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ante.getNome();
            case 1:
                return ante.getRaca().getNome();
            case 2:
                return ante.getRaca().getVantagem();
            case 3:
                return ante.getRaca().getHabilidadeEspecial();
        }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome sub-raça","Nome raça", "HabilidadeEspecial", "Proficiência"};
        return nomes[column];
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !lista.isEmpty() ) {
                lista.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            lista = novaLista;
            fireTableRowsInserted( 0, lista.size() - 1);
        }
        
    }
}

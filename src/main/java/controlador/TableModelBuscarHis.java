/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dominio.Historia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 2023122760123
 */
public class TableModelBuscarHis extends AbstractTableModel {
    private List listaItens  = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Historia item = (Historia) listaItens.get(rowIndex);
        switch ( columnIndex ) {
            case 0: return item.getNome();
            case 1: return item.getMestre().getNome();
            case 2: return item.getStatus();         
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Mestre", "Status" };
        return nomes[column];
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
        
    }
    
    public Object getItem (int rowIndex) {
        return listaItens.get(rowIndex);        
    }
}

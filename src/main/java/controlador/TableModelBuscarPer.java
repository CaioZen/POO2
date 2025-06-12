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
 * @author 2023122760123
 */
public class TableModelBuscarPer extends AbstractTableModel {
    private List listaPer = new ArrayList();

    @Override
    public int getRowCount() {
        return listaPer.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
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
                return item.getClasse().getNome();
            case 3:
                return item.getSubRaca().getRaca().getNome();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Usuário", "Classe", "Raça"};
        return nomes[column];
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
    
    public List<Personagem> getItems(List<Integer> rowIndices) {
        List<Personagem> selecionados = new ArrayList<>();
        for (Integer index : rowIndices) {
            if (index >= 0 && index < listaPer.size()) {
                selecionados.add((Personagem) listaPer.get(index));
            }
        }
        return selecionados;
    }
}

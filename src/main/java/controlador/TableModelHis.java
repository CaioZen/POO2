package controlador;

import dominio.Historia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelHis extends AbstractTableModel {
    private List listaHis = new ArrayList();
    
    @Override
    public int getRowCount() {
        return listaHis.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Historia item = (Historia) listaHis.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return item.getNome();
            case 1:
                return item.getMestre();
            case 2:
                return item.getStatus();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Mestre", "Status"};
        return nomes[column];
    }
    public void remover(int indice) {
        fireTableRowsDeleted(indice, indice);
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaHis.isEmpty() ) {
                listaHis.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaHis = novaLista;
            fireTableRowsInserted( 0, listaHis.size() - 1);
        }
        
    }
    
    public Object getItem (int rowIndex) {
        return listaHis.get(rowIndex);        
    }
}

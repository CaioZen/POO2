package controlador;

import dominio.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelUsuario extends AbstractTableModel {



    @Override
    public int getRowCount() {
        //return listaUsr.size();
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        Usuario item = (Usuario) listaUsr.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                return item.getNome();
//            case 1:
//                return item.getCelular();
//            case 2:
//                return item.getEmail();
//            case 3:
//                return "Espirito Santo"; //Teste
//            case 4:
//                return item.getCidade();
//            case 5:
//                return item.getCep();
//            case 6:
//                return item.getEndereco();
//        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Celular", "Email", "UF", "Cidade", "CEP", "Endereco"};
        return nomes[column];
    }

    public void remover(int indice) {
//        listaUsr.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}

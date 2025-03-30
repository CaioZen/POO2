package controlador;

import dominio.Historia;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelHis extends AbstractTableModel {

    private Historia historia1 = new Historia("Aventuras", "Grande Descrição", 0, "Antônio");
    private Historia historia2 = new Historia("Viagens", "Grande Descrição", 0, "Caio");
    private Historia historia3 = new Historia("Amizades", "Grande Descrição", 0, "Carlos");
    private List<Historia> listaHis = List.of(historia1, historia2, historia3);

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
                if (item.getStatus() == 0) {
                    return "EM ANDAMENTO";
                } else {
                    return "FINALIZADA";
                }

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "Mestre", "Status"};
        return nomes[column];
    }

}

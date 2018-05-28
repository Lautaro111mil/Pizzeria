
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ModeloListaPedidos implements TableModel {

    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private List<TableModelListener> listener = new ArrayList<TableModelListener>();

    @Override
    public int getRowCount() {
        return pedidos.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 5; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreColumna = "";
        if (columnIndex == 0) {
            nombreColumna = "Cliente";
        } else if (columnIndex == 1) {
            nombreColumna = "Hora";
        } else if (columnIndex == 2) {
            nombreColumna = "Minutos";
        } else if (columnIndex == 3) {
            nombreColumna = "Demora";
        } else if (columnIndex == 4) {
            nombreColumna = "Costo";
        }

        return nombreColumna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = pedidos.get(rowIndex);
        String valor = "";
        if (columnIndex == 0) {
            valor = pedido.getNombreCliente();
        } else if (columnIndex == 1) {
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            valor = hora;
        } else if (columnIndex == 2) {
            String minutos = (String) String.valueOf(pedido.getMinutosPedido());
            valor = minutos;
        } else if (columnIndex == 3) {
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            valor = demora;
        } else if (columnIndex == 4) {
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());
        }
        return pedido;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    this.listener.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        this.listener.remove(l);
    }

}


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelEvent;
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
            valor = (String) String.valueOf(pedido.getItemPedido().calcularCosto());
        }
        return valor;
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

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);

        TableModelEvent evento = new TableModelEvent(this, this.pedidos.size() - 1, this.pedidos.size() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        for (TableModelListener listener : this.listener) {
            listener.tableChanged(evento);
        }
    }

    public void limpiarPedidos() {

        List<Integer> posicionesAtrasadas = new ArrayList<Integer>();
        List<Pedido> pedidosABorrar = new ArrayList<Pedido>();
        
        for (int i = 0; i < this.pedidos.size(); i++) {

            Pedido unPedido = this.pedidos.get(i);
            if (unPedido.estaAtrasado(new Date())) {
                posicionesAtrasadas.add(i);
                pedidosABorrar.add(unPedido);
            }
        }

        this.pedidos.removeAll(pedidosABorrar);
        
        for (Integer posicion : posicionesAtrasadas) {
                        
            TableModelEvent evento = new TableModelEvent(this, posicion, posicion, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
            for (TableModelListener listener : this.listener) {
                listener.tableChanged(evento);
            }

        }

    }

}

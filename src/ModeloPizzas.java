
import java.util.ArrayList;
import java.util.Comparator;
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
public class ModeloPizzas implements TableModel{

        private List<ItemPedido> pizzas = new ArrayList<ItemPedido>();
        private List<TableModelListener> listener = new ArrayList<TableModelListener>();

    public List<ItemPedido> getPizzas() {
        return pizzas;
    }

    
    @Override
    public int getRowCount() {
        return pizzas.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreColumna = "";
        if (columnIndex == 0) {
            nombreColumna = "Cantidad";
        } else if (columnIndex == 1) {
            nombreColumna = "Tamaño";
        } else if (columnIndex == 2) {
            nombreColumna = "Tipo";
        } else if (columnIndex == 3) {
            nombreColumna = "Variedad";
        } else if (columnIndex == 4) {
            nombreColumna = "Observación";
        } else if (columnIndex==5){
            nombreColumna= "Costo";
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
        ItemPedido pizzas = this.pizzas.get(rowIndex); 
        String valor = "";
        if (columnIndex == 0) {
            String cantidad= String.valueOf(pizzas.getCantidad());
            valor = cantidad;
        } else if (columnIndex == 1) {
            String porciones = String.valueOf(pizzas.getPizza().getTamaño());
            valor = porciones;
        } else if (columnIndex == 2) {
            String tipoString = String.valueOf(pizzas.getPizza().getTipo());
            valor = tipoString;
        } else if (columnIndex == 3) {
            String variedadString = String.valueOf(pizzas.getPizza().getVariedad());
            valor = variedadString;
        } else if (columnIndex == 4) {
            valor = pizzas.getObservacion();
        }else if( columnIndex==5){
            String costoStrin= String.valueOf(pizzas.calcularCostoPizzasRepetidas());
            valor=costoStrin;
        }
        return valor;
    
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        }

    @Override
    public void addTableModelListener(TableModelListener l) {
        this.listener.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
     this.listener.remove(l);
    }
    
    public void agregarPizzas(ItemPedido itemPedido){
        this.pizzas.add(itemPedido);

        TableModelEvent evento = new TableModelEvent(this, this.pizzas.size() - 1, this.pizzas.size() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        for (TableModelListener listener : this.listener) {
            listener.tableChanged(evento);
        }             
      
    }
    
}

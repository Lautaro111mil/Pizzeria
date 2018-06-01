
import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Pedido {

    private String nombreCliente;
    private int horaPedido;
    private int minutosPedido;
    private int minutosDemora;
    private List<ItemPedido> itemsPedidos = new ArrayList();
    private boolean fueEntregado;
    private Date horaEntrega;

    public boolean getFueEntregado() {
        return fueEntregado;
    }

    public void setFueEntregado(boolean fueEntregado) {
        this.fueEntregado = fueEntregado;
    }
    
    public Pedido(String nombreCliente, int horaPedido, int minutosPedido, int minutosDemora,ItemPedido itemPedido) throws Exception {
        if (nombreCliente.isEmpty() || nombreCliente == null) {
            throw new Exception("Ingrese un nombre de cliente válido");
        }
        this.nombreCliente = nombreCliente;
        this.horaPedido = horaPedido;
        if (minutosDemora <= 0) {
            throw new Exception("Ingrese una demora válida");
        }
        this.minutosPedido = minutosPedido;
        this.minutosDemora = minutosDemora;
        itemsPedidos.add(itemPedido);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.HOUR_OF_DAY, horaPedido);
        calendar.set(calendar.MINUTE, minutosPedido);
        calendar.add(calendar.MINUTE, minutosDemora);
        this.horaEntrega = calendar.getTime();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public long getMinutosDemora() {
        return minutosDemora;
    }

    public int getHoraPedido() {
        return horaPedido;
    }

    public int getMinutosPedido() {
        return minutosPedido;
    }

    public List<ItemPedido> getItemsPedidos() {
        return itemsPedidos;
    }

    

    public boolean estaAtrasado(Date ahora) {
        return horaEntrega.before(ahora);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombreCliente);
        hash = 61 * hash + this.horaPedido;
        hash = 61 * hash + this.minutosPedido;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.horaPedido != other.horaPedido) {
            return false;
        }
        if (this.minutosPedido != other.minutosPedido) {
            return false;
        }
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        return true;
    }

    public Date getHoraEntrega() {
        return horaEntrega;
    }
  
    public double calcularCostoTotal(){
        double costoTotal=0;
        for (ItemPedido item : itemsPedidos){
            costoTotal+=item.calcularCostoPizzasRepetidas();
    }
        return costoTotal;
    }
}

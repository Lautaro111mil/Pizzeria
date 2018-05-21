
import java.awt.print.Printable;
import java.util.Calendar;
import java.util.Date;

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
    private ItemPedido itemPedido;

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

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public Pedido(String nombreCliente, int horaPedido, int minutosPedido, int minutosDemora, ItemPedido itemPedido) throws Exception {
        if (nombreCliente.isEmpty() || nombreCliente == null || nombreCliente.contains("0") || nombreCliente.contains("1") || nombreCliente.contains("2") || nombreCliente.contains("3") || nombreCliente.contains("4") || nombreCliente.contains("5") || nombreCliente.contains("6") || nombreCliente.contains("7") || nombreCliente.contains("8") || nombreCliente.contains("9")) {
            throw new Exception("Ingrese un nombre de cliente válido");
        }
        this.nombreCliente = nombreCliente;
        if (minutosDemora < 0) {
            throw new Exception("Ingrese una demora válida");
        }
        this.minutosDemora = minutosDemora;
        this.itemPedido = itemPedido;
    }

    public boolean estaAtrasado(Date ahora) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.HOUR_OF_DAY, horaPedido);
        calendar.set(calendar.MINUTE, minutosPedido);
        calendar.add(calendar.MINUTE, minutosDemora);
        Date fechaPedido = calendar.getTime();
        return fechaPedido.after(ahora);
    }

}

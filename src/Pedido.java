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
    private int diaCreacion;
    private int mesCreacion;
    private int anioCreacion;
    private int demoraEstimada;
    private ItemPedido itemPedido;
    private final int ANIO_CREACION = 2018;

    public Pedido(String nombreCliente, int diaCreacion, int mesCreacion, int anioCreacion, int demoraEstimada, ItemPedido itemPedido) throws Exception {
        if (nombreCliente.isEmpty() || nombreCliente == null || nombreCliente.contains("0") && nombreCliente.contains("1") && nombreCliente.contains("2") && nombreCliente.contains("3") && nombreCliente.contains("4") && nombreCliente.contains("5") && nombreCliente.contains("6") && nombreCliente.contains("7") && nombreCliente.contains("8") && nombreCliente.contains("9")) {
            throw new Exception("Ingrese un nombre de cliente válido");
        }
        this.nombreCliente = nombreCliente;
        if (diaCreacion < 1 || diaCreacion > 31) {
            throw new Exception("Ingrese un día válido");
        }
        this.diaCreacion = diaCreacion;
        if (mesCreacion < 10 || diaCreacion > 12) {
            throw new Exception("Ingrese un mes válido");
        }
        this.mesCreacion = mesCreacion;
        if (anioCreacion < ANIO_CREACION) {
            throw new Exception("Ingrese un año válido");
        }
        this.anioCreacion = anioCreacion;
        if (demoraEstimada < 1) {
            throw new Exception("Ingrese una demora estimada válida");
        }
        this.demoraEstimada = demoraEstimada;
        this.itemPedido = itemPedido;
    }

}

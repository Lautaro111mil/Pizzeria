/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PedidoTest {

    private Date fechaActual;

    @Test
    public void deberiaPoderCrearseUnPedido() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 10, 5, 30, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioVacio() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 10, 5, 30, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioNulo() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido(null, 10, 5, 30, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioConNumeros() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("123", 10, 5, 30, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnaDemoraNegativa() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 10, 5, -30, itemPedido);
    }

    @Test
    public void deberiaPoderCrearseUnPedidoConUnaDemoraIgualA0() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 10, 5, 0, itemPedido);
    }

    @Test
    public void pedidoNoEstaAtrasadoALas8Y30SiDebeSerEntregado8Y35() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 8, 25, 5, itemPedido);
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.HOUR_OF_DAY, 8);
        calendar.set(calendar.MINUTE, 35);
        fechaActual = calendar.getTime();
        boolean estaAtrasado = pedido.estaAtrasado(fechaActual);
        assertFalse(estaAtrasado);
    }

    @Test
    public void pedidoEstaAtrasadoALas8Y30SiDebeSerEntregado8Y25() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 8, 20, 5, itemPedido);
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.HOUR_OF_DAY, 8);
        calendar.set(calendar.MINUTE, 30);
        fechaActual = calendar.getTime();
        boolean estaAtrasado = pedido.estaAtrasado(fechaActual);
        assertFalse(estaAtrasado);
    }

    @Test
    public void pedidoNoEstaAtrasadoALas8Y30SiDebeSerEntregado8Y30() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 8, 25, 5, itemPedido);
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.HOUR_OF_DAY, 8);
        calendar.set(calendar.MINUTE, 30);
        fechaActual = calendar.getTime();
        boolean estaAtrasado = pedido.estaAtrasado(fechaActual);
        assertFalse(estaAtrasado);
    }
}

}

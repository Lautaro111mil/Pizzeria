/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PedidoTest {

    @Test
    public void deberiaPoderCrearseUnPedido() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("Lautaro", 16, 5, 2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioVacio() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, 2018, 40, itemPedido);
    }

    @Test (expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioNulo() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
            Pedido pedido = new Pedido(null, 16, 5, 2018, 40, itemPedido);
    }
    
    @Test (expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnNombreDeUsuarioConNumeros() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
            Pedido pedido = new Pedido("9", 16, 5, 2018, 40, itemPedido);
    }
    
    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnDiaDeCreacionNegativo() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", -16, 5, 2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnDiaDeCreacionIgualA0() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 0, 5, 2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnMesDeCreacionNegativo() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, -5, 2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnMesDeCreacionIgualA0() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 0, 2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnAñoDeCreacionNegativo() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, -2018, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnAñoDeCreacionIgualA0() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, 0, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnAñoDeCreacionMenorA2018() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, 2017, 40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnaDemoraNegativa() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, 2018, -40, itemPedido);
    }

    @Test(expected = Exception.class)
    public void noDeberiaPoderCrearseUnPedidoConUnaDemoraIgualA0() throws Exception {
        Pizza pizza = new Pizza();
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
        ItemPedido itemPedido = new ItemPedido(pizza, 1);
        Pedido pedido = new Pedido("", 16, 5, 2018, 0, itemPedido);
    }

}

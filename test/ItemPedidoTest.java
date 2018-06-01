/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ItemPedidoTest {

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearseConUnaCantidadNegativa() {
        Pizza pizza1 = new Pizza();
        ItemPedido item = new ItemPedido(pizza1, -1);

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearseConUnaCantidad0() {
        Pizza pizza1 = new Pizza();
        ItemPedido item = new ItemPedido(pizza1, 0);

    }

    @Test
    public void deberiaPoderCrearseUnItemPedidoCon2Pizzas() {
        Pizza pizza1 = new Pizza();
        ItemPedido item = new ItemPedido(pizza1, 2);
    }

    @Test
    public void deberiaSer340ElCostoDe2PizzasGrandesDeMuzzarellaALaPiedra() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(8);
        pizza1.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 2);
        double costo = item.calcularCostoPizzasRepetidas();
        assertEquals(340, costo, 0.001);
    }

    @Test
    public void deberiaSer630ElCostoDe3PizzasExtraGrandesDeJamonYMorronesALaParrilla() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(10);
        pizza1.setTipo(Tipo.PARRILLA);
        Variedad variedad = new Variedad("Jamon y morrones", 60);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 3);
        double costo = item.calcularCostoPizzasRepetidas();
        assertEquals(630, costo, 0.001);
    }

    @Test
    public void deberiaSer240ElCostoDe1PizzaGiganteDeFugazettaAlMolde() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(12);
        pizza1.setTipo(Tipo.MOLDE);
        Variedad variedad = new Variedad("Fugazzeta", 40);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 1);
        double costo = item.calcularCostoPizzasRepetidas();
        assertEquals(210, costo, 0.001);
    }

    @Test
    public void deberiaSer760ElCostoDe4PizzaGrandeDeCuatroQuesosALaPiedra() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(8);
        pizza1.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Cuatro quesos", 70);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 4);
        double costo = item.calcularCostoPizzasRepetidas();
        assertEquals(760, costo, 0.001);
    }

    @Test
    public void deberiaPoderHacerseUnaObservacion() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(8);
        pizza1.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Jamon y morrones", 60);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 2);
        item.setObservacion("Sin morrones");
    }

    @Test
    public void deberiaPoderNoHacerseUnaObservacion() {
        Pizza pizza1 = new Pizza();
        pizza1.setTamaño(8);
        pizza1.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Jamon y morrones", 60);
        pizza1.setVariedad(variedad);
        ItemPedido item = new ItemPedido(pizza1, 2);
    }
    
}

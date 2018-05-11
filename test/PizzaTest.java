/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author User
 */
public class PizzaTest {

    private Pizza pizza;

    @Before
    public void inicializar() {
        pizza = new Pizza();
    }

    @Test
    public void deberiaPoderCrearUnaPizzaGrandeALaPiedraDeMuzzarella() {
        pizza.setTamaño(8);
        pizza.setTipo(Tipo.PIEDRA);
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
    }

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearUnaPizzaConUnaCantidadDePorcionesNegativa() {
        pizza.setTamaño(-1);

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearUnaPizzaConPorciones0() {
        pizza.setTamaño(0);

    }

    @Test
    public void deberiaPoderCrearUnaPizzaCon10Porciones() {
        pizza.setTamaño(10);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaCon8Porciones() {
        pizza.setTamaño(8);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaCon12Porciones() {
        pizza.setTamaño(12);

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearUnaPizzaNapolitana() {
        Variedad variedad = new Variedad("Napolitana", 100);
        pizza.setVariedad(variedad);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaDeJamonYMorrones() {
        Variedad variedad = new Variedad("Jamon y morrones", 60);
        pizza.setVariedad(variedad);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaDeMuzzarella() {
        Variedad variedad = new Variedad("Muzzarella", 50);
        pizza.setVariedad(variedad);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaDeCuatroQuesos() {
        Variedad variedad = new Variedad("Cuatro quesos", 70);
        pizza.setVariedad(variedad);
    }

    @Test(expected = Error.class)
    public void noDeberiaPoderCrearUnaPizzaDeVariedadVacia() {
        Variedad variedad = new Variedad("", 0);
        pizza.setVariedad(variedad);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaALaParrilla() {
        pizza.setTipo(Tipo.PARRILLA);
    }

    @Test
    public void deberiaPoderCrearUnaPizzaAlMolde() {
        pizza.setTipo(Tipo.MOLDE);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ItemPedido {

    private Pizza pizza;
    private long cantidad;

    public ItemPedido(Pizza pizza, long cantidad) {
          if (cantidad <= 0) {
          throw new Error("La cantidad ingresada debe ser mayor a 0");
       }
        this.pizza = pizza;
        this.cantidad = cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    
    public double calcularCosto() {
        return pizza.calcularCosto() * cantidad;
    }

}

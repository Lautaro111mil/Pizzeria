/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pizza {

    private int tamaño;
    private Variedad variedad;
    private Tipo tipo;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        if (tamaño != 8 && tamaño != 10 && tamaño != 12) {
            throw new Error("La pizza pueden ser de 8, 10 o 12 porciones");
        }
        this.tamaño = tamaño;
    }

    public Variedad getVariedad() {
        return variedad;
    }

    public void setVariedad(Variedad variedad) {
        this.variedad = variedad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        if (tipo != Tipo.PIEDRA && tipo != Tipo.PARRILLA && tipo != Tipo.MOLDE) {
            throw new Error("La pizza puede ser a la piedra, a la parrilla o al molde");
        }
        this.tipo = tipo;
    }

    public double calcularCosto() {
        double precioTamaño = 0;
        if (tamaño == 8) {
            precioTamaño = 100;
        }
        if (tamaño == 10) {
            precioTamaño = 120;
        }
        if (tamaño == 12) {
            precioTamaño = 130;
        }
        double precioTipo = 0;
        if (this.tipo == Tipo.PIEDRA) {
            precioTipo = 20;
        }
        if (this.tipo == tipo.PARRILLA) {
            precioTipo = 30;
        }
        if (this.tipo == tipo.MOLDE) {
            precioTipo = 40;
        }
        double precioVariedad = 0;

        if (variedad.getNombre().equals("Muzzarella")) {
            precioVariedad = 50;
        }
        if (variedad.getNombre().equals("Jamon y morrones")) {
            precioVariedad = 60;
        }
        if (variedad.getNombre().equals("Fugazzeta")) {
            precioVariedad = 40;
        }
        if (variedad.getNombre().equals("Cuatro quesos")) {
            precioVariedad = 70;
        }
        if (variedad.getNombre().equals("Napolitana")) {
            precioVariedad = 70;
        }
            
        return precioTamaño + precioTipo + precioVariedad;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorestaurante;

/**
 *
 * @author COMPHP
 */
public class Pedidos {
    private String primerPlato;
    private String segundoPlato;
    private String Bebida;
    private String Postre;
    private double precioPrimerPlato;
    private double precioSegundoPlato;
    private double precioSegundoBebida;
    private double precioSegundoPostre;

    public Pedidos(String primerPlato, String segundoPlato, String Bebida, String Postre, double precioPrimerPlato, double precioSegundoPlato, double precioSegundoBebida, double precioSegundoPostre) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.Bebida = Bebida;
        this.Postre = Postre;
        this.precioPrimerPlato = precioPrimerPlato;
        this.precioSegundoPlato = precioSegundoPlato;
        this.precioSegundoBebida = precioSegundoBebida;
        this.precioSegundoPostre = precioSegundoPostre;
    }

    public Pedidos() {
    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public double getPrecioPrimerPlato() {
        return precioPrimerPlato;
    }

    public void setPrecioPrimerPlato(double precioPrimerPlato) {
        this.precioPrimerPlato = precioPrimerPlato;
    }

    public double getPrecioSegundoPlato() {
        return precioSegundoPlato;
    }

    public void setPrecioSegundoPlato(double precioSegundoPlato) {
        this.precioSegundoPlato = precioSegundoPlato;
    }

    public double getPrecioSegundoBebida() {
        return precioSegundoBebida;
    }

    public void setPrecioSegundoBebida(double precioSegundoBebida) {
        this.precioSegundoBebida = precioSegundoBebida;
    }

    public double getPrecioSegundoPostre() {
        return precioSegundoPostre;
    }

    public void setPrecioSegundoPostre(double precioSegundoPostre) {
        this.precioSegundoPostre = precioSegundoPostre;
    }
     public double calcularPedido(String primerPlato, double valorPrimerPlato, String bebida, double valorBebida) {
        return valorPrimerPlato + valorBebida;
    }

    public double calcularPedido(String primerPlato, double valorPrimerPlato, String segundoPlato, double valorSegundoPlato,
                                 String bebida, double valorBebida) {
        return valorPrimerPlato + valorSegundoPlato + valorBebida;
    }

    public double calcularPedido(String primerPlato, double valorPrimerPlato, String segundoPlato, double valorSegundoPlato,
                                 String bebida, double valorBebida, String postre, double valorPostre) {
        return valorPrimerPlato + valorSegundoPlato + valorBebida + valorPostre;
    }      
 }


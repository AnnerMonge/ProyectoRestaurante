/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectorestaurante;

/**
 *
 * @author Anner
 */
public class ProyectoRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();

        double total1 = pedido.calcularPedido("Ensalada", 5.0, "Agua", 1.5);
        System.out.println("Total del pedido 1: " + total1);

        double total2 = pedido.calcularPedido("Sopa", 4.0, "Pechuga", 8.5, "Refresco", 2.0);
        System.out.println("Total del pedido 2: " + total2);

        double total3 = pedido.calcularPedido("Pasta", 6.0, "Carne", 10.0, "Jugo", 2.5, "Helado", 3.0);
        System.out.println("Total del pedido 3: " + total3);
    }
    
}

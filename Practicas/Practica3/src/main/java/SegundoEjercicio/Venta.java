/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String nombre;
    private String fecha;
    private String tipoDocumento;
    private String numeroDocumento;
    private List<IDetalleVenta> detalles;

    public Venta(String nombre, String fecha, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(IDetalleVenta detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (IDetalleVenta d : detalles) {
            total += d.getPrecio();
        }
        return total;
    }

    public void mostrarRecibo() {
        System.out.println("\n========================================");
        System.out.println("          TICKET DE VENTA");
        System.out.println("========================================");
        System.out.println("Cliente: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Doc: " + tipoDocumento + " - " + numeroDocumento);
        System.out.println("----------------------------------------");
        for (IDetalleVenta d : detalles) {
            d.mostrarDetalle("");
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL A COBRAR: Bs. " + calcularTotal());
        System.out.println("========================================");
    }
}

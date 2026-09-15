/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
public class ProductoSimple implements IDetalleVenta {
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ProductoSimple(String descripcion, int cantidad, double precioUnitario) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String getDescripcion() { return descripcion; }
    
    @Override
    public int getCantidad() { return cantidad; }
    
    @Override
    public double getPrecio() { return cantidad * precioUnitario; }
    
    @Override
    public void mostrarDetalle(String prefijo) {
        System.out.println(prefijo + cantidad + "x " + descripcion + " - Bs. " + getPrecio());
    }
}

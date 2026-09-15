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

public class ProductoCompuesto implements IDetalleVenta {
    private String descripcion;
    private int cantidad;
    private List<IDetalleVenta> productos;

    public ProductoCompuesto(String descripcion, int cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(IDetalleVenta producto) {
        productos.add(producto);
    }

    @Override
    public String getDescripcion() { return descripcion; }
    
    @Override
    public int getCantidad() { return cantidad; }
    
    @Override
    public double getPrecio() {
        double total = 0;
        for (IDetalleVenta p : productos) {
            total += p.getPrecio();
        }
        return total * cantidad;
    }
    
    @Override
    public void mostrarDetalle(String prefijo) {
        System.out.println(prefijo + cantidad + "x [Paquete] " + descripcion + " - Bs. " + getPrecio());
        for (IDetalleVenta p : productos) {
            p.mostrarDetalle(prefijo + "  ");
        }
    }
}

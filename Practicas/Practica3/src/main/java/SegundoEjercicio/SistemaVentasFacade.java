/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
public class SistemaVentasFacade {
    private Venta ventaActual;

    public void iniciarVenta(String nombre, String fecha, String tipoDoc, String numDoc) {
        ventaActual = new Venta(nombre, fecha, tipoDoc, numDoc);
    }

    public void agregarProductoSimple(String desc, int cant, double precio) {
        if (ventaActual != null) {
            ventaActual.agregarDetalle(new ProductoSimple(desc, cant, precio));
            System.out.println("-> Producto agregado al carrito.");
        }
    }

    public void agregarProductoCompuesto(ProductoCompuesto compuesto) {
        if (ventaActual != null) {
            ventaActual.agregarDetalle(compuesto);
            System.out.println("-> Paquete promocional agregado al carrito.");
        }
    }

    public void procesarVenta(int opcionPago) {
        if (ventaActual == null || ventaActual.calcularTotal() == 0) {
            System.out.println("No hay productos en la venta actual.");
            return;
        }
        
        ventaActual.mostrarRecibo();
        
        MetodoPago metodoPago = PagoFactory.crearMetodoPago(opcionPago);
        metodoPago.procesarPago(ventaActual.calcularTotal());
        
        System.out.println("Venta finalizada con éxito.");
        ventaActual = null; 
    }
}
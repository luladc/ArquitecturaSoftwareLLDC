/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
public interface IDetalleVenta {
    String getDescripcion();
    int getCantidad();
    double getPrecio();
    void mostrarDetalle(String prefijo);
}
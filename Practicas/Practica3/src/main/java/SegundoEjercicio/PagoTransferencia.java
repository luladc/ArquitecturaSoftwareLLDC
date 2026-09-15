/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
public class PagoTransferencia implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de Bs. " + monto + " procesado mediante TRANSFERENCIA BANCARIA (QR/Cuenta).");
    }
}
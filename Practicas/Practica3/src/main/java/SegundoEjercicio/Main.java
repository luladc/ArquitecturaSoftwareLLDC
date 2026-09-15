/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author LLDC
 */
// --- Main.java (Menú de Consola) ---
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVentasFacade sistema = new SistemaVentasFacade();
        
        // Iniciamos una venta por defecto
        sistema.iniciarVenta("Cliente Mostrador", "09/09/2026", "NIT", "1234567015");
        
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- MINISUPER - SISTEMA DE VENTAS ---");
            System.out.println("1. Agregar Producto Simple");
            System.out.println("2. Agregar Paquete Promocional (Compuesto)");
            System.out.println("3. Vender (Cobrar)");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cant = Integer.parseInt(scanner.nextLine());
                    System.out.print("Precio unitario (Bs.): ");
                    double precio = Double.parseDouble(scanner.nextLine());
                    
                    sistema.agregarProductoSimple(desc, cant, precio);
                    break;
                    
                case 2:
                    System.out.print("Nombre del paquete: ");
                    String nombrePaquete = scanner.nextLine();
                    System.out.print("Cantidad de paquetes: ");
                    int cantPaquete = Integer.parseInt(scanner.nextLine());
                    
                    ProductoCompuesto paquete = new ProductoCompuesto(nombrePaquete, cantPaquete);
                    
                    System.out.println("--- Agregando productos al paquete ---");
                    while (true) {
                        System.out.print("Descripción del ítem ('fin' para terminar): ");
                        String itemDesc = scanner.nextLine();
                        if (itemDesc.equalsIgnoreCase("fin")) break;
                        
                        System.out.print("Cantidad de este ítem en el paquete: ");
                        int itemCant = Integer.parseInt(scanner.nextLine());
                        System.out.print("Precio unitario (Bs.): ");
                        double itemPrecio = Double.parseDouble(scanner.nextLine());
                        
                        paquete.agregarProducto(new ProductoSimple(itemDesc, itemCant, itemPrecio));
                    }
                    sistema.agregarProductoCompuesto(paquete);
                    break;
                    
                case 3:
                    System.out.println("\nSeleccione el método de pago:");
                    System.out.println("1. Efectivo");
                    System.out.println("2. Tarjeta de Crédito");
                    System.out.println("3. Transferencia Bancaria");
                    System.out.print("Opción: ");
                    int tipoPago = Integer.parseInt(scanner.nextLine());
                    
                    sistema.procesarVenta(tipoPago);
                    
                    System.out.print("\n¿Desea iniciar una nueva venta? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        sistema.iniciarVenta("Nuevo Cliente", "09/09/2026", "NIT", "000000");
                    } else {
                        opcion = 4;
                    }
                    break;
                    
                case 4:
                    System.out.println("Cerrando caja...");
                    break;
                    
                default:
                    System.out.println("Opción fuera de rango.");
            }
        }
        scanner.close();
    }
}

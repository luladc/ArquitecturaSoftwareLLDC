/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fig.practica2;

/**
 *
 * @author LLDC
 */
import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoo = new Zoologico("ZooBol", "Av. Jaime", "7770252");
        
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\n--- GESTIÓN DEL ZOOLÓGICO ---");
            System.out.println("1. Añadir mamífero");
            System.out.println("2. Añadir ave");
            System.out.println("3. Añadir pez");
            System.out.println("4. Mostrar mamíferos");
            System.out.println("5. Mostrar aves");
            System.out.println("6. Mostrar peces");
            System.out.println("7. Mostrar información del zoológico");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    AnimalFactory mamiferoFactory = new MamiferoFactory();
                    System.out.print("Tipo (leon/oso/mono): ");
                    String tipoM = scanner.nextLine();
                    Mamifero mamifero = (Mamifero) mamiferoFactory.crearAnimal(tipoM);
                    
                    if (mamifero != null) {
                        System.out.print("Nombre: ");
                        mamifero.setNombre(scanner.nextLine());
                        System.out.print("Temperatura: ");
                        mamifero.setTemperatura(Double.parseDouble(scanner.nextLine()));
                        System.out.print("Número de patas: ");
                        mamifero.setNumeroPatas(Integer.parseInt(scanner.nextLine()));
                        System.out.print("Color: ");
                        mamifero.setColor(scanner.nextLine());
                        
                        zoo.agregarJaula(crearJaula(scanner, mamifero));
                        System.out.println("¡Mamífero añadido con éxito!");
                    } else {
                        System.out.println("Especie de mamífero no reconocida.");
                    }
                    break;

                case 2:
                    AnimalFactory aveFactory = new AveFactory();
                    System.out.print("Tipo (loro/aguila/condor): ");
                    String tipoA = scanner.nextLine();
                    Ave ave = (Ave) aveFactory.crearAnimal(tipoA);
                    
                    if (ave != null) {
                        System.out.print("Nombre: ");
                        ave.setNombre(scanner.nextLine());
                        System.out.print("Peso (kg): ");
                        ave.setPeso(Double.parseDouble(scanner.nextLine()));
                        System.out.print("Tamaño de alas (m): ");
                        ave.setTamanoAlas(Double.parseDouble(scanner.nextLine()));
                        
                        zoo.agregarJaula(crearJaula(scanner, ave));
                        System.out.println("¡Ave añadida con éxito!");
                    } else {
                        System.out.println("Especie de ave no reconocida.");
                    }
                    break;

                case 3:
                    AnimalFactory pezFactory = new PezFactory();
                    System.out.print("Tipo (pacu/sabalo): ");
                    String tipoP = scanner.nextLine();
                    Pez pez = (Pez) pezFactory.crearAnimal(tipoP);
                    
                    if (pez != null) {
                        System.out.print("Nombre: ");
                        pez.setNombre(scanner.nextLine());
                        System.out.print("Longitud (m): ");
                        pez.setLongitud(Double.parseDouble(scanner.nextLine()));
                        
                        zoo.agregarJaula(crearJaula(scanner, pez));
                        System.out.println("¡Pez añadido con éxito!");
                    } else {
                        System.out.println("Especie de pez no reconocida.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Mamíferos ---");
                    for (Jaula j : zoo.getListaJaulas()) {
                        if (j.getAnimal() instanceof Mamifero) {
                            System.out.println(j.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Lista de Aves ---");
                    for (Jaula j : zoo.getListaJaulas()) {
                        if (j.getAnimal() instanceof Ave) {
                            System.out.println(j.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n--- Lista de Peces ---");
                    for (Jaula j : zoo.getListaJaulas()) {
                        if (j.getAnimal() instanceof Pez) {
                            System.out.println(j.toString());
                        }
                    }
                    break;

                case 7:
                    System.out.println("\n--- Información del Zoológico ---");
                    System.out.println(zoo.toString());
                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static Jaula crearJaula(Scanner scanner, Animal animal) {
        System.out.print("Alto de la jaula (m): ");
        double alto = Double.parseDouble(scanner.nextLine());
        System.out.print("Ancho de la jaula (m): ");
        double ancho = Double.parseDouble(scanner.nextLine());
        System.out.print("Largo de la jaula (m): ");
        double largo = Double.parseDouble(scanner.nextLine());
        return new Jaula(animal, alto, ancho, largo);
    }
}

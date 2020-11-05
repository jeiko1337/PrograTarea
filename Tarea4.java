/*
 * Fundamentos de programación
 * Unidad 3
 * Práctica 3
 * Programa 4: algoritmo para una casa de cambio
 * Equipo: Slayer
 * Integrante1: Fernandez Zamudio David Jacob
 * Integrante2: Guerrero Villanueva Maximo
 */
package tareaprogra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.##");

        int cliente = 0;
        String cambio = "";
        double dolar = 21.33, euro = 24.85, yenes = 0.20, cantidad, ganancia = 0;
        double ganancia2 = 0, ganancia3 = 0;

        while (!cambio.equals("S")) {
            cliente++; //Acumulador de clientes atendidos

            System.out.println("\n**********************************************************************");
            System.out.println("Ingrese el digito del tipo de cambio que desea hacer: ");
            System.out.println("\nD. Dolar");
            System.out.println("Y. Yenes");
            System.out.println("E. Euros");
            System.out.println("S. Salir\n");
            System.out.println("**********************************************************************");
            cambio = sc.next().toUpperCase();

            switch (cambio) {
                case "D": // conversion en dolares
                    System.out.println("\n**********************************************************************");
                    System.out.println("\nEl cambio en dolares es de $" + dolar);
                    System.out.println("Ingrese la cantidad de dolares a convertir:");
                    cantidad = sc.nextDouble();
                    double conversion = cantidad * dolar;
                    ganancia += conversion;
                    System.out.println("su conversion fue de $" + df.format(conversion) + " pesos\n");
                    System.out.println("**********************************************************************");
                    break;
                case "E": //Conversion a euros
                    System.out.println("\n**********************************************************************");
                    System.out.println("\nEL cambio en euros es de $" + euro);
                    System.out.println("Ingrese la cantidad en euros a convertir:");
                    cantidad = sc.nextDouble();
                    double conversion2 = cantidad * euro;
                    ganancia2 += conversion2;
                    System.out.println("su conversion fue de $" + df.format(conversion2) + " pesos\n");
                    System.out.println("**********************************************************************");
                    break;
                case "Y": //Conversion en yenes
                    System.out.println("\n**********************************************************************");
                    System.out.println("\nEl cambio en yenes es de $" + yenes);
                    System.out.println("Ingrese la cantidad en yenes a convertir:");
                    cantidad = sc.nextDouble();
                    double conversion3 = cantidad * yenes;
                    ganancia3 += conversion3;
                    System.out.println("su conversion fue de $" + df.format(conversion3) + " pesos\n");
                    System.out.println("**********************************************************************");
                    break;
                case "S": //Salir del programa
                    continue;
                default:
                    System.out.println("\nOpcion invalida\n");
            }
        }
        System.out.println("\nClientes atendidos: " + cliente);
        System.out.println("La ganancia del dolar fue de $" + ganancia);
        System.out.println("La ganancia del euro fue de $" + ganancia2);
        System.out.println("La ganancia del yen fue de $" + ganancia3);
    }

}

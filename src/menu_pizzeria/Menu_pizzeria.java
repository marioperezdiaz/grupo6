/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_pizzeria;

import java.util.Scanner;

/**
 *
 * @author DAM123
 */
public class Menu_pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado=new Scanner(System.in);
      
        System.out.println("MENU:");
        System.out.println("    1. Añadir pizzas basicas");
        System.out.println("    2. Añadir pizzas con ingrediente");
        System.out.println("    3. Cambiar tamaño de las pizzas");
        System.out.println("    4. Eliminar pizzas");
        System.out.println("    5. Calcular ticket");
        System.out.println("    6. Salir");
        
        int opcion=teclado.nextInt();
        
        int contadorpizzasbasicas=0;
        int contadorpizzasingredientes=0;
        int contadorPizzasBasicasGrandes=0;
        int contadorPizzasIngredienteGrandes=0;
        
        while (opcion != 6) {
            
            switch (opcion) {
                
                case 1:
                    System.out.println("Cuantas pizzas basicas desea pedir?");
                    contadorpizzasbasicas = contadorpizzasbasicas + teclado.nextInt();
                    break;

                case 2:
                    System.out.println("Cuantas pizzas con ingredientes deseas pedir?");
                    contadorpizzasingredientes = contadorpizzasingredientes + teclado.nextInt();

                    System.out.println("Que ingrediente desea añadir?"
                            + "(1.Queso, 2.tomate, 3.peperoni, 4.bacon)");
                    int respuesta = teclado.nextInt();

                    while (respuesta > 4 | respuesta < 1) {
                        System.out.println("No ha escogido una respuesta correcta. Escoja (1.Queso, 2.tomate, 3.peperoni, 4.bacon)");
                        respuesta = teclado.nextInt();
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println("No ha introducido una opcion correcta, vuelva a introducir una:");
            }
            System.out.println("MENU:");
            System.out.println("    1. Añadir pizzas basicas");
            System.out.println("    2. Añadir pizzas con ingrediente");
            System.out.println("    3. Cambiar tamaño de las pizzas");
            System.out.println("    4. Eliminar pizzas");
            System.out.println("    5. Calcular ticket");
            System.out.println("    6. Salir");
            opcion = teclado.nextInt();
        }
        System.out.println("El programa ha finalizado");
    }

}

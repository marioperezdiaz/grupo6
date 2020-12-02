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
        System.out.println("    1. Añadir pizzas");
        System.out.println("    2. Añadir ingrediente");
        System.out.println("    3. Cambiar tamño pizzas");
        System.out.println("    4. Eliminar pizzas");
        System.out.println("    5. Calcular ticket");
        System.out.println("    6. Salir");
        
        int opcion=teclado.nextInt();
        
        int contadorpizzasbasicas=0;
        int contadorpizzasingredientes=0;
        int contadoringredientes=0;
        
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    System.out.println("Cuantas pizzas desea pedir?");
                    contadorpizzasbasicas = contadorpizzasbasicas + teclado.nextInt();
                    break;
                case 2:
                    System.out.println("A cuantas pizzas desea añadir ingredientes?");
                    contadorpizzasingredientes = teclado.nextInt();
                    while (contadorpizzasingredientes > contadorpizzasbasicas) {
                        System.out.println("No tiene tantas pizzas, introduza un numero menor al de pizzas ordenadas: " + contadorpizzasbasicas);
                        contadorpizzasingredientes = teclado.nextInt();
                    }
                    contadorpizzasbasicas = contadorpizzasbasicas - contadorpizzasingredientes;

                    System.out.println("Desea añadir alguno de los siguientes ingredientes?"
                            + "(1.Queso, 2.tomate, 3.peperoni, 4.bacon, 0.no añadir ingredientes)");
                    int respuesta = teclado.nextInt();

                    while (respuesta > 4 | respuesta < 0) {
                        System.out.println("No ha escogido una respuesta correcta. Escoja (1.Queso, 2.tomate, 3.peperoni, 4.bacon, 0.no añadir ingredientes)");
                        respuesta = teclado.nextInt();
                    }
                    if (respuesta >= 1 && respuesta <= 4) {
                        contadoringredientes++;
                    }
            }

        }
    }

}

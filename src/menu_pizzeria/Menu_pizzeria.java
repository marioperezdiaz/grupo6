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
        int opcion;
        do{
        System.out.println("Menu:");
        System.out.println("    1- Anadir pizza");
        System.out.println("    2- Anadir ingrediente pizza");
        System.out.println("    3- Cambiar el tamano de las pizzas");
        System.out.println("    4- Eliminar pizzas");
        System.out.println("    5- Obtener ticket");
        System.out.println("    6- Salir");
        
        opcion=teclado.nextInt();
        }
        while (opcion!=6);
    }
    
}

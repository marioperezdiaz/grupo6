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
        System.out.println(": Introduce una opción: ");
        System.out.println("1: Pedir pizza simple");
        System.out.println("2: Añadir ingrediente");
        System.out.println("3: Quitar ingrediente");
        System.out.println("4: Elegir masa");
        System.out.println("5: Cancelar pedido");
        int opc = teclado.nextInt();
        int cont_pizza = 0;
        int queso_extra = 0;
        int peperoni = 0;
        int masa_fina = 0;
        int masa_original = 0;
        while(opc<=5){
            switch(opc){
                case 1:                  
                    cont_pizza++;    
                    break;
                case 2:
                    System.out.println("¿Qué ingrdiente quieres añadir? 1- peperoni 2- queso extra");
                    int ingrediente = teclado.nextInt();
                    if(ingrediente == 1){
                        peperoni++;
                    }else {
                        queso_extra++;
                    }
                    break;
                case 3:
                    System.out.println("¿Qué ingrdiente quieres quitar? 1- peperoni 2- queso extra");
                    int extraer = teclado.nextInt();
                    if(extraer == 1){
                        peperoni++;
                    }else {
                        queso_extra++;
                    }
                    break;
                case 4:
                    System.out.println("¿Qué tipo de masa quieres? 1- fina 2- original");
                    int masa = teclado.nextInt();
                    if(masa == 1){
                        masa_fina++;
                    }else {
                        masa_original++;
                    }                    
                    break;
                case 5:
                    cont_pizza=0;
                    peperoni=0;
                    queso_extra=0;
                    break;     
            }
        
    }
        System.out.println("Fin del pedido");
    
}
    
}


package Inciso_C;

import java.util.Scanner;


public class Operaciones {
 
 public static void main(String [] args){
  Scanner palabra = new Scanner(System.in);
 
  Scanner stri = new Scanner (System.in);
 
 Conjuntos obj = new Conjuntos();
 
 int x = 0;
 int O = 0;
 String U = " ";
     System.out.println("Cuantos conjuntos desea? \nMaximo 3, Minimo 2");
 x = palabra.nextInt();
 
    if(x>3){
        System.out.println("Solo puede introducir como maximo 3 y minimo 3 \nEScriba nuevamente el numero de conjuntos");
         x = palabra.nextInt();
    }
    System.out.println("");
 
    obj.metodos(x);
    System.out.println("");
 
    while(O!=3){
    
        System.out.println("¿Que operacion desea hacer?");
         System.out.println("1.Union \n2.Interseccion \n3.Cerrar el programa");
          System.out.println("Escriba el numero de la opcion");
    O = palabra.nextInt();
    
    switch(O){
    
        case 1: 
            System.out.println("Escriba los conjuntos en mayusculas");
            System.out.println("Para que se identique como union se debe de poner una U mayuscula entre los dos conjuntos\nEjemplo AUB,AUC");
                
            U = stri.nextLine();
                 obj.Union( U);
            ;break;
    
        case 2:
            System.out.println("Escriba los conjuntos en mayusculas");
            System.out.println("Para que se identique como interseccion se debe de poner una n entre los dos conjuntos\nAnC,AnC");
        
            U = stri.nextLine();
            obj.Interseccion(U);
            
                ;break;
    
        case 3:
            System.out.println("El programa ha finalizado");
        
    ;break;
    
    
    }
    
    
    
    }
    
    
    
    
    
    
 }
 }   
    
    
    
    
    
    
    
    


package poo_juegoahorcado;

import Clases.Procesos;
import java.util.Scanner;
import java.util.Random;

public class POO_JuegoAhorcado {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Random r = new Random(); 
       String[] palabras = {"melon","pera","coco","uva", "manzana", "sandia", "nuez", "ciruela", "rambutan"}; //Arreglo de palabras.
       int n_azar = r.nextInt(palabras.length); 
       
       
       Procesos pro = new Procesos(); 
       
       
       pro.Cadena(palabras, n_azar); 
       pro.OcultarCadena(); 
       
       for(int i = 1; i <= 6; i++){
           pro.Juego(entrada, i);
           pro.Verificacion(i);
            System.out.println(pro.getCadenaJuego()); 
       }
    }
}

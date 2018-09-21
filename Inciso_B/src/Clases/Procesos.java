
package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class Procesos {
    char cadena[];
    char cadenaJuego[];
    char intento;
    String[] palabras;
    
    
    public char[] getCadena() {
        return cadena;
    }

    public char[] getCadenaJuego() {
        return cadenaJuego;
    }

    public void setCadena(char[] cadena) {
        this.cadena = cadena;
    }

    public void setCadenaJuego(char[] cadenaJuego) {
        this.cadenaJuego = cadenaJuego;
    }
    
    public void Cadena(String[] palabras, int tamaño){
        cadena = palabras[tamaño].toCharArray(); 
        cadenaJuego = palabras[tamaño].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i< cadenaJuego.length; i++){ 
            cadenaJuego[i] = '*';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(cadenaJuego));
    }
    
    public void Juego(Scanner en, int i){
        System.out.print(i + " -Intento: ");
        intento = en.next().charAt(0);
          for(int x = 0; x < cadena.length ;x++){
                if(cadena[x]==intento){
                 cadenaJuego[x] = intento;
                }
           } 
    }
    
    public void Verificacion(int i){
         if(Arrays.equals(cadena, cadenaJuego)){
                System.out.println("\nFelicidades Lo has logrado.");
                 i = 6;
            }else if(i==6){
                System.out.println("\nOh No. Perdiste");
                System.exit(0);
          }
    }
}
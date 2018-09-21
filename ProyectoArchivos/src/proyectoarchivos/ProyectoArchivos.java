
package proyectoarchivos;

import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoArchivos {

   
    public static void main(String[] args) {
       Clases archivo = new Clases();
       Scanner en = new Scanner(System.in);
       
       ArrayList lineas= new ArrayList();
       lineas = archivo.leer_fichero(); //Asignamos el areglo retornado a uno nuevo del main.
       
       String []nombres = archivo.Arraysnombres(lineas, lineas.size()); //Pasamos el arreglo a un nuevo areglo de string para poder
                                                                        //trabajarlo de mejor manera en los metodos.
        System.out.print("Elige Opcion: \n1- Mostrar Archivos \n2- Ordenar Archivos \n3- Buscar Elemento \nOpcion:");
        int op = en.nextInt();
        switch(op){
            case 1:
                archivo.MostrarDatos(nombres);
                 break;
            case 2:
                archivo.OrdenarDatos(nombres);
                break;
            case 3:
                System.out.print("Buscar: ");  
                String buscar = en.next();
                archivo.BuscarNombre(nombres, buscar);
                break;
        }
    }
}

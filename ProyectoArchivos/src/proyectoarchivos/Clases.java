
package proyectoarchivos;

//Paquetes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Clases {
    String direccion = "C:/users/Admin/Desktop/nombres.txt"; //Direccion del Archivo
   
    public ArrayList leer_fichero(){
        ArrayList arreglo= new ArrayList(); //Pasa elementos x elementos a un vector.
        
        try {
            FileReader ficha = new FileReader(direccion); //captura del archivo
            BufferedReader dato = new BufferedReader(ficha); //Lectura del archivo.
           
            String linea = "";
                    
            while(linea != null){ //Cuando es -1 ya no hay texto que mostrar.
                linea = dato.readLine(); //Lee cada palabra almacenada en un archivo.
                /*
                Un lectura con buffer siempre termina con null. por eso se pone este if,
                para que no imprima en pantalla ese null del buffer.
                */
                if(linea!=null){ 
                    arreglo.add(linea); //Captura los valores de linea al vector lineas.
               } 
            } 
        } catch (IOException ex) { //Excepcion si encuentra un problema.
            System.out.println("Archivo No Encontrado");
        }
        return arreglo; //retorna el areglo nuevo.
    }
    
    public String []Arraysnombres(ArrayList list, int b){
        String a[] = new String[b];
        for(int i = 0; i < list.size(); i++){
            a[i] = (String)list.get(i); //Pasa cada elemento del ArrayList al areglo de String
        }
        return a; //Retorna el Nuevo areglo de String con los valores.
    }
    
    public void MostrarDatos(String []nombres){
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
    
    public void OrdenarDatos(String []nombres){
        Arrays.sort(nombres); //Metodo que ordena los elementos del Arreglo nombre.
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
    
    public void BuscarNombre(String []nombres, String buscar){
        boolean buscado = false;
        for(int i = 0; i < nombres.length; i++){
            if(nombres[i].equals(buscar)){
                System.out.println("Nombre " + nombres[i] + " Encontrado");
                buscado = true;
            }else if(buscado == false && i == (nombres.length-1)){ //Para que no repita el mensaje de error en el ciclo.
                System.out.println("Nombre no encontrado");
            }  
        }
    }
    
    
    
    
    
 
}

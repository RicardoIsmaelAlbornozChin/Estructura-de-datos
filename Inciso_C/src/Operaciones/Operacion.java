
package Operaciones;

import javax.swing.JOptionPane;


public class Operacion {
    
//Atributos
    int numero1;
    int numero2;
    int suma;
    int multi;
    int resta;   
    int nombres;
    int sucesor;
    int antecesor;
    
//metodos

//metodo para pedirle al usuario que digite dos numeros
    public void Leernumeros(){
    
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
    }
    //metodo para sumar
    public void sumar(){
    
        suma = numero1 + numero2;
    }
    
    //metodo para restar
    public void restar(){
    
        resta = numero1 - numero2;
    }
    
    //metodo para multiplicar
    public void multiplicar (){
   
        multi = numero1 * numero2;
   } 
   
    //Metodo para mostrar el sucesor
  public void Sucesor(){
  
  sucesor = numero1 + 1;
  
  }
   
  //Metodo para mostrar el anteceaor
  public void Antecesor(){
  
      antecesor = numero1 - 1;
  
  }
  
  //Metodo para mostrar si es cero o diferente
  public void Escero(){
  
  if(numero1 == 0){
      System.out.println("El numero es cero ");
  }else{
  
      System.out.println("El numero ingresado es diferente de cero ");
    }
  }
  
  //Metdo para mostrar si es menor o mayor
  public void Menor(){
  if(numero1 < numero2){
  
  System.out.println("El numero " + numero1 + " Es menor que el numero " + numero2);
  }else {
  
    System.out.println("El numero " + numero1 + " Es mayor que el numero " + numero2);
      }
  }
  
  //Metodo para mostrar si es igual
  public void Igualar(){
  if(numero1 == numero2){
      System.out.println("El numero " + numero1 + " Es igual al numero " + numero2);
    }
 }
  
       public void mostrarREsultados(){
       System.out.println("La suma es "  + suma);
       System.out.println("La resta es " + resta);
       System.out.println("La multiplicacion es " + multi);
       System.out.println("EL sucesor es " + sucesor);
       System.out.println("El antecesor es " + antecesor);
   }
    
}


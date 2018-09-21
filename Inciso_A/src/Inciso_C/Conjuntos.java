
package Inciso_C;

import java.util.Scanner;

    public class Conjuntos {
       Scanner leer = new Scanner(System.in);  
        String A[];
        String B[];
        String C[];
        String a[];

        String con1;
        String con2;
        String con3;

       public void metodos(int x){

        A = new String [5];
        B = new String [5];
        C = new String [5];


        while(x < 6){
        switch(x){

            case 1: System.out.println("No puede realizarse con un solo conjunto");
                    System.out.println("Minimo 2, Maximo 3");
                    x = leer.nextInt();
        break;

            case 2: 
                System.out.println("Introduzca los elementos del conjunto A");
                for(int i = 0; i < 5; i++){
                A[i] = leer.nextLine();

                }
                System.out.println(" ");
                System.out.println("Introduzca los elementos del conjunto B");
                for(int d = 0; d < 5; d++){
                B[d] = leer.nextLine();
                }
                x=6;
                break;

            case 3 : 
                System.out.print("Introduzcs los elementos del conjunto A");
        for(int i =0; i < 5; i++){

            A[i] = leer.nextLine();
        }
                System.out.println("Introduce los elementos del conjunto B");
                for(int i= 0; i<5;i++){
            B[i] = leer.nextLine();
                }

                System.out.println(" ");

                System.out.println("Introduzca los elementos del conjunto C");
                for(int i = 0;i<5;i++){

                C[i] = leer.nextLine();
                }
                x = 6;
                }
              }
            }

    public void Union(String U){

        a = new String[10];
        int i = 0;
        System.out.println("La Union es ");
        System.out.print("R ={");

        if(U.equals("AUB") || U.equals("BUA")){
            for (int j = 0; j < A.length;j++)
            a[j] = A[j];
        }
/* {
    for (int j = 0; j < A.length;j++)
        a[j] = A[j];
        }
*/
        for(int j = 5; j<10;j++){
        a[j] = B[i];
        i++;
        }

        for(int j =0; j<10;j++){
            System.out.print(a[j] +" ");
        }


        if(U.equals("AUC")  || U.equals("CUA")){
            for(int j = 0; j < A.length;j++){
            a[j] = A[j];
            }
        
            
        for(int j = 5; j<10;j++){
        a[j] = C[i];
        i++;
        }
        for(int j = 0; j< 10;j++){
            System.out.println(a[j] + " ");
        }
      }

    if(U.equals("BUC") || U.equals("CUB")){

           for(int j =0; j<A.length;j++){
        a[j] = B[j];
           }
   
    for(int j = 5; j < 10; j++){
        a[j] = C[i];
        i++;
    }
    for (int j = 0; j<10; j++){
        System.out.println(a[j] + " ");

         }
    }
        System.out.print(" } ");
        System.out.println("\n");
    }

    public void Interseccion(String U){

    a = new String[5];
        System.out.println("Interseccion es");
        System.out.print("R = {");
    String b = "1";

    if(U.equals("AnB") || U.equals("BnA")){

        for(int i = 0; i< A.length;i++){
        if(A[0].equals(B[i]) || A[1].equals(B[i]) || A[2].equals(B[i]) || A[3].equals(B[i]) || A[4].equals(B[i])) {
                a[i] = B[i];
        }
        if(a[i] != null )
                System.out.print(a[i] + " ");
        }
      }

    if(U.equals("AnC") || U.equals("CnA")){

        for(int i= 0; i < A.length; i++ ){

            if(A[0].equals(C[i]) || A[1].equals(C[i]) || A[2].equals(C[i]) || A[3].equals(C[i]) || A[4].equals(C[i])){
          a[i] = C[i];  

      }

        if(a[i] != null){

            System.out.print(a[i] + " ");    

        }
        }

        if(U.equals("BnC") || U.equals("CnB")){
        for(int i = 0; i< A.length;i++){
            if(B[0].equals(C[i]) || B[1].equals(C[i]) || B[2].equals(C[i]) || B[3].equals(C[i]) || B[4].equals(C[i]) ){
        a[i] = C[i];

          }
           if(a[i] != null){
               System.out.println(a[i] + " ");
      } 
      }    
      }
      }
        System.out.print("}");
        System.out.println("\n");  
    }




    }











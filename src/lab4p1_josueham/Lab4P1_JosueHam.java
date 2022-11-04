package lab4p1_josueham;

import java.util.Scanner;


public class Lab4P1_JosueHam {

    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        
        do {
            System.out.println("");
            System.out.println(" ----- Bienvenido al menu del programa -----");
            System.out.println("1 -> Ejercicio 1: Sumador Binario");
            System.out.println("2 -> Ejercicio 2: Contains");
            System.out.println("3 -> Ejercicio 3: Alpha");
            System.out.println("4 -> Para salir del programa");
            System.out.println("Ingrese la opcion que desea: ");
                opcion = leer.nextInt();
            
                switch (opcion) {
                    
                    case 1: { 
                        System.out.println("Ingrese la primera cadena de binarios: ");
                        String cadena_1 = leer.next();
                        System.out.println("Ingrese la segunda cadena de binarios: ");
                        String cadena_2 = leer.next();
                        binarios(cadena_1, cadena_2);
                       
                    }//Fin case 1
                    break; 
                    
                    case 2: {    
                        System.out.println("Ingrese la primera cadena: ");
                        String cadena_1 = leer.next().toLowerCase();
                        System.out.println("Ingrese la segunda cadena: ");
                        String cadena_2 = leer.next().toLowerCase();
                        contains(cadena_1, cadena_2);
                        
                    }//Fin case 2
                    break;
                    
                    case 3: {
                        System.out.println("Ingrese su cadena: ");
                        String cadena = leer.next().toLowerCase();
                        is_alpha (cadena);
                        
                    }//Fin case 3
                    break; 
                    
                    default: 
                        System.out.println("Saliendo del programa...");
                }//Fin switch 
        }while (opcion!=4);
    }//Fin main
    
    public static void binarios (String cadena_1, String cadena_2){
        
        for (int i = 0; i < cadena_1.length(); i++) {
            
        }//Fin for
    }//Fin metodo binarios
    
    
    
    public static void contains (String cadena_1, String cadena_2){
        
        
        String nuevo = " ";
        
            for (int i = 0; i < cadena_2.length(); i++) {
             boolean esta = false; 
                for (int j = 0; j < cadena_1.length(); j++) {
                    if (cadena_1.charAt(i) == cadena_2.charAt(j)){
                        esta = true;
                }
                    if (esta){
                        nuevo+= cadena_1.charAt(i);
                    }
              }
            }
           
            if (cadena_2.equals(nuevo))
                System.out.println("La palabra " + cadena_1 + " no contiene a la cadena " + cadena_2);
            else {
                System.out.println("La palabra " + cadena_1 + " contiene la cadena " + cadena_2 );
                }
        
        if(cadena_2.length() > cadena_1.length());{
            System.out.println("La cadena 2 (contenida) no puede ser mayor que la cadena 1 (contenedor)");
        }//Fin if validacion
                  
    }//Fin metodo contains
    
    public static void is_alpha(String cadena){
        
        int cont = 0,cont_1 = 0;
    
        
            for (int j = 0; j < cadena.length(); j++) {
                 char letra = cadena.charAt(j);
               if ((int) letra >= 97 && (int) letra <= 122) {
                   cont++; 
            }//Fin if ascii
               else {
                   cont_1++;
               }//Fin else
        }//Fin for j
        if (cont_1 > 0){
            System.out.println("La palabra contiene caracteres que no son letras");
        }
        else {
            System.out.println("La palabra solo contiene letras");
        }//Fin else
    }//Fin metodo alpha 
}//Fin clase 

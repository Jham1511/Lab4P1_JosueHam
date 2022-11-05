package lab4p1_josueham; //git

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
                        leer.nextLine();
                        String cadena_1 = leer.nextLine().toLowerCase();
                        System.out.println("Ingrese la segunda cadena: ");
                        String cadena_2 = leer.next().toLowerCase();
                        contains(cadena_1, cadena_2);
                        
                    }//Fin case 2
                    break;
                    
                    case 3: {
                        System.out.println("Ingrese su cadena: ");
                        leer.nextLine();
                        String cadena = leer.nextLine().toLowerCase();
                        is_alpha (cadena);
                         
                    }//Fin case 3
                        break; 
                    
                    default: 
                        System.out.println("Saliendo del programa...");
                }//Fin switch 
        }while (opcion!=4);
    }//Fin main
    
    
    public static void binarios (String cadena_1, String cadena_2){
        
        
         // Validacion de que las cadenas sean del mismo tamano
       if (cadena_1.length() == cadena_2.length()) {
            boolean valida1 = true, valida2 = true;
            for (int i = 0; i < cadena_1.length(); i++) {
                if (cadena_1.charAt(i) != '1' && cadena_1.charAt(i) != '0')
                    valida1 = false;
                if (cadena_2.charAt(i) != '1' && cadena_2.charAt(i) != '0')
                    valida2 = false;
            }
            // Validacion de que las cadenas contengan solo 1s y 0s
            if (valida1 && valida2) {
                String suma = "";
                boolean lleva = false;
                for (int i = cadena_1.length()-1; i >= 0; i--) {
                    String numeros = "" + cadena_1.charAt(i) + cadena_2.charAt(i);
                    if (numeros.contains("10") || numeros.contains("01")) {
                        suma += '1';
                        lleva = false;
                    }
                    else if (numeros.contains("00")) {
                        suma += '0';
                        lleva = false;
                    }
                    else if (numeros.contains("11")) {
                        if (lleva)
                            suma += '1';
                        suma += '0';
                        lleva = true;
                    }
                    
                }
                System.out.println("La suma es: " + suma);
            }
            else {
                if (!valida1 && valida2)
                    System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                else if (valida1 && !valida2)
                    System.out.println("El segundo número contiene caracteres distintos de '0' y '1'.");
                else
                    System.out.println("Las cadenas contiene caracteres distintos de '0' y '1'.");
            }
        }
        else {
            System.out.println("Los números deben de tener el mismo número de bits.");
        }
       
       
        
        
    }//Fin metodo binarios
    
    
    
    public static void contains (String cadena_1, String cadena_2){
        if (cadena_1.length() > cadena_2.length()) {
            int cont = 0;
        
            for (int i = 0; i < cadena_1.length(); i++) {
                if (cont == cadena_2.length()) {
                    break;
                }
                if (cadena_1.charAt(i)== cadena_2.charAt(cont)) {
                   cont++; 
                }
                else if (cont > 0 && cadena_1.charAt(i)!=cadena_2.charAt(cont)){
                    cont = 0;
                }
              
            }//Fin for
            
            if (cont == cadena_2.length()) {
                System.out.println("La palabra " + cadena_1 + " contiene a la cadena " + cadena_2);
            }
            else {
                System.out.println("La palabra " + cadena_1 + " no contiene a la cadena " + cadena_2);
            }
        }//Fin if validacion 
        else {
            System.out.println("El tamaño de la segunda cadena no puede ser mayor que el de la primera.");
        }//Fin else

        
                  
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

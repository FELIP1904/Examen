/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
        import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                  
                	// Opción 1: Concatenar dos palabras
                	System.out.print("Ingrese la primera palabra: ");
                	String palabra1 = scanner.nextLine();
                	System.out.print("Ingrese la segunda palabra: ");
                	String palabra2 = scanner.nextLine();
                	System.out.println("Resultado de la concatenación: " + palabra1 + palabra2);

                }

                case 2 -> {

                }

                case 3 -> {
                    System.out.print("Ingrese una frase: ");
                	String fraseParaContar = scanner.nextLine();
                	System.out.print("Ingrese la letra a buscar: ");
                	char letra = scanner.nextLine().charAt(0);
                	int contador = 0;
                	for (char c : fraseParaContar.toCharArray()) {
                    	if (c == letra) {
                        	contador++;
                    	}
                	}
                	System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
                  
                }

                case 4 -> {
                   
                    System.out.print("¿Está seguro de que desea salir? (s/n): ");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("Saliendo del programa...");
                    } else {
                        System.out.println("Regresando al menú...");
                    }
                }

                default -> System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
            
        } 

        
    }
}

       
    
    


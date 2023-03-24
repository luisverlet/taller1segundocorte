package coso;
import java.util.*;

/**
 *
 * @author luisv
 */
public class triangulo5 {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de asteriscos de la base y altura del triangulo: ");
        int n = scanner.nextInt();

        System.out.print("Escriba la alineacion(i para izquierda o d para derecha): ");
        char alineacion = scanner.next().charAt(0);

        if (alineacion == 'd') {
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (alineacion == 'i') {
                    
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Escriba una letra valida.");
        }
    }
}
    

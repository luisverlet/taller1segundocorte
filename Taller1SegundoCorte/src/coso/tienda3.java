
package coso;
import java.util.Scanner;

public class tienda3 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Escribe el numero de latas a apilar: ");
      
    int latasrequeridas = scanner.nextInt();

        int i = 1;
        int latas = 0;
        while (latas < latasrequeridas) {
            latas += i;
            i++;
        }

        if (latas == latasrequeridas) {
            System.out.println("Es posible de apilar");
        } else {
            System.out.println("No es posible");
            System.out.println("El numero mas cercano de latas es: " + (latas - i + 1));
        }
    }
}


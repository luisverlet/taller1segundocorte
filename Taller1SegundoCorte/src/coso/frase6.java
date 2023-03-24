package coso;
import java.util.*;

public class frase6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba una frase: ");
        String frase = scanner.nextLine();
       
        String[] palabras = frase.split("\\s+"); 

        System.out.println("Numero de palabras: " + palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabras[i] + " (caracteres: " + palabras[i].length() + ")");
        }
    }
}

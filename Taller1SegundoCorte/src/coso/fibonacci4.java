package coso;
import java.util.*;

public class fibonacci4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print( "Numero de elementos de la serie de Fibonacci a calcular: ");
        int elementos = scanner.nextInt();

        int num1 = 0, num2 = 1, fib;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < elementos; i++) {
            fib = num1 + num2;
            System.out.print(fib + " ");
            num1 = num2;
            num2 = fib;
        }
    }
    
}

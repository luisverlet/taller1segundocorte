package coso;
import java.util.*;

public class vectores7 {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(" tamano del primer vector: ");
        int n1 = scanner.nextInt();
        double[] vector = new double[n1];

        System.out.println("elementos del primer vector:");
        for (int i = 0; i < n1; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.print("tamano del segundo vector: ");
        int n2 = scanner.nextInt();
        double[] vector2 = new double[n2];

        System.out.println("elementos del segundo vector:");
        for (int i = 0; i < n2; i++) {
            vector2[i] = scanner.nextDouble();
        }

        // Fusionar vectores y ordenar de manera ascendente
        double[] vectorAsc = new double[n1 + n2];
        System.arraycopy(vector, 0, vectorAsc, 0, n1);
        System.arraycopy(vector2, 0, vectorAsc, n1, n2);
        Arrays.sort(vectorAsc);

        // Fusionar vectores y ordenar de manera descendente
        double[] vectorDesc = new double[n1 + n2];
        System.arraycopy(vector, 0, vectorDesc, 0, n1);
        System.arraycopy(vector2, 0, vectorDesc, n1, n2);
        Arrays.sort(vectorDesc);
        for (int i = 0; i < vectorDesc.length / 2; i++) {
            double temp = vectorDesc[i];
            vectorDesc[i] = vectorDesc[vectorDesc.length - i - 1];
            vectorDesc[vectorDesc.length - i - 1] = temp;
        }

        // Mostrar resultados
        System.out.println("Vector fusionado y ordenado de manera ascendente:");
        for (int i = 0; i < vectorAsc.length; i++) {
            System.out.print(vectorAsc[i] + " ");
        }
        System.out.println();

        System.out.println("Vector fusionado y ordenado de manera descendente:");
        for (int i = 0; i < vectorDesc.length; i++) {
            System.out.print(vectorDesc[i] + " ");
        }
        System.out.println();
    }
}
    


package coso;
import java.util.*;


public class horas1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese segundos: ");
    int segundos = scanner.nextInt();

    int dias = segundos / 86400;
    segundos = segundos % 86400;

    int horas = segundos / 3600;
    segundos = segundos % 3600;

    int minutos = segundos / 60;
    segundos = segundos % 60;

    System.out.println("Equivalente en formato 24H: " + dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
  
  }
}
        
    

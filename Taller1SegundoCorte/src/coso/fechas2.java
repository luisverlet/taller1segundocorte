package coso;
import java.util.*;


public class fechas2 {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
    
   System.out.println("Introduce un ano: ");
        int ano = scanner.nextInt();
        System.out.println("Introduce mes ");
        int mes = scanner.nextInt();
        System.out.println("Introduce dia ");
        int dia = scanner.nextInt();
        int dias = 0;
        
        boolean valid = true;
        if (ano < 1) {
      valid = false;
    }
    else {
        
      switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          if (dia < 1 || dia > 31) {
            valid = false;
          }
          else {
            dias += dia;
          }
          break;
        case 4: case 6: case 9: case 11:
          if (dia < 1 || dia > 30) {
            valid = false;
          }
          else {
            dias += dia + 31;
          }
          break;
        case 2:
          if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            if (dia < 1 || dia > 29) {
              valid = false;
            }
            else {
              dias += dia + 31 + 29;
            }
          }
          else {
            if (dia < 1 || dia > 28) {
              valid = false;
            }
            else {
              dias += dia + 31 + 28;
            }
          }
          break;
        default:
          valid = false;
          break;
      }
    }
    if (valid) {
      System.out.println("La fecha ingresada es valida y han transcurrido " + dias + " dias.");
    }
    else {
      System.out.println("no es valida.");
      }
  }
}
    
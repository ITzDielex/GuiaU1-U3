package diasdelasemana;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7: ");
        int numeroDia = scanner.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Hola, soy el dia lunes.");
                break;
            case 2:
                System.out.println("Hola, soy el dia martes.");
                break;
            case 3:
                System.out.println("Hola, soy el dia miercoles.");
                break;
            case 4:
                System.out.println("Hola, soy el dia jueves.");
                break;
            case 5:
                System.out.println("Hola, soy el dia viernes.");
                break;
            case 6:
                System.out.println("Hola, soy el dia sabado.");
                break;
            case 7:
                System.out.println("Hola, soy el dia domingo.");
                break;
            default:
                System.out.println("Numero no valido. Ingrese un numero del 1 al 7.");
        }

        scanner.close();
    }
}

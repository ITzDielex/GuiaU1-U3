package menutaqueria;

import java.util.Scanner;

public class MenuTaqueria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Taqueria");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de carne asada");
            System.out.println("3. Tacos de pollo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usted ha elegido Tacos de pastor. Buen provecho!");
                    break;
                case 2:
                    System.out.println("Usted ha elegido Tacos de carne asada. Buen provecho!");
                    break;
                case 3:
                    System.out.println("Usted ha elegido Tacos de pollo. Buen provecho!");
                    break;
                case 4:
                    System.out.println("Saliendo del menu de taqueria. Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

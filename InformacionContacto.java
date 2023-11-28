package informacioncontacto;

import java.util.Scanner;

public class InformacionContacto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese su correo electronico: ");
        String correoElectronico = scanner.nextLine();

        System.out.print("Ingrese su numero de telefono: ");
        String telefono = scanner.nextLine();

        System.out.println("Informacion de contacto:");
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);

        scanner.close();
    }
}

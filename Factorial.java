package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para calcular su factorial: ");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}

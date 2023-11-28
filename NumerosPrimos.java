package numerosprimos;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 2 y 500:");

        for (int numero = 2; numero <= 500; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

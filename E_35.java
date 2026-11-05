import java.util.Scanner;

public class E_35 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el monto de inversion: ");
        double inversion = teclado.nextDouble();

        System.out.print("Ingresa los dias de plazo: ");
        int dias = teclado.nextInt();

        double rendimiento = (inversion * 0.095 * dias / 365);

        System.out.println("El rendimiento ganado es: " + rendimiento);
    }
}

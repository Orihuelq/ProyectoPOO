import java.util.Scanner;

public class E_34 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu sueldo mensual: ");
        double sueldo = teclado.nextDouble();

        System.out.print("Ingresa los anios de antiguedad: ");
        int anios = teclado.nextInt();

        System.out.print("Ingresa tus deudas actuales: ");
        double deudas = teclado.nextDouble();

        boolean aprobado = ((sueldo > 15000) && (anios > 3) && (deudas < 5000));

        System.out.println("Se aprueba el prestamo: " + aprobado);
    }
}

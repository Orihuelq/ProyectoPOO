import java.util.Scanner;

public class E_25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la nota del examen 1: ");
        double examen1 = teclado.nextDouble();

        System.out.print("Ingresa la nota del examen 2: ");
        double examen2 = teclado.nextDouble();

        boolean aprueba = ((examen1 >= 80) || (examen2 >= 80));

        System.out.println("Aprueba la certificacion: " + aprueba);
    }
}

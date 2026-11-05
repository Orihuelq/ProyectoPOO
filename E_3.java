import java.util.Scanner;

public class E_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa x1: ");
        double x1 = teclado.nextDouble();

        System.out.print("Ingresa y1: ");
        double y1 = teclado.nextDouble();

        System.out.print("Ingresa x2: ");
        double x2 = teclado.nextDouble();

        System.out.print("Ingresa y2: ");
        double y2 = teclado.nextDouble();

        double distancia = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("El cuadrado de la distancia es: " + distancia);
    }
}

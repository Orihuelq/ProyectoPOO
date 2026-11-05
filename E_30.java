import java.util.Scanner;

public class E_30 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el lado a: ");
        double a = teclado.nextDouble();

        System.out.print("Ingresa el lado b: ");
        double b = teclado.nextDouble();

        System.out.print("Ingresa el lado c: ");
        double c = teclado.nextDouble();

        boolean isosceles = ((a == b) || (a == c) || (b == c));

        System.out.println("Al menos dos lados son iguales: " + isosceles);
    }
}

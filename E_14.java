import java.util.Scanner;

public class E_14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el radio del primer circulo: ");
        double radio1 = teclado.nextDouble();

        System.out.print("Ingresa el radio del segundo circulo: ");
        double radio2 = teclado.nextDouble();

        boolean mayor = ((3.14159 * radio1 * radio1) > (3.14159 * radio2 * radio2));

        System.out.println("El primer circulo tiene mayor area: " + mayor);
    }
}

import java.util.Scanner;

public class E_50 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa x: ");
        double x = teclado.nextDouble();

        System.out.print("Ingresa y: ");
        double y = teclado.nextDouble();

        System.out.print("Ingresa el radio: ");
        double radio = teclado.nextDouble();

        boolean dentro = ((x * x + y * y) <= (radio * radio));

        System.out.println("El punto esta dentro o sobre el circulo: " + dentro);
    }
}

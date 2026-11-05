import java.util.Scanner;

public class E_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el radio: ");
        double radio = teclado.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = teclado.nextDouble();

        double volumen = (3.14159 * radio * radio * altura);

        System.out.println("El volumen del cilindro es: " + volumen);
    }
}

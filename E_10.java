import java.util.Scanner;

public class E_10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el largo: ");
        double largo = teclado.nextDouble();

        System.out.print("Ingresa el ancho: ");
        double ancho = teclado.nextDouble();

        System.out.print("Ingresa el alto: ");
        double alto = teclado.nextDouble();

        double area = (2 * (largo * ancho + largo * alto + ancho * alto));

        System.out.println("El area total es: " + area);
    }
}

import java.util.Scanner;

public class E_36 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el subtotal de la compra: ");
        double subtotal = teclado.nextDouble();

        System.out.print("Ingresa la distancia en kilometros: ");
        double distancia = teclado.nextDouble();

        boolean gratis = ((subtotal > 800) || (distancia < 3));

        System.out.println("Tiene envio gratis: " + gratis);
    }
}

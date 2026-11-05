import java.util.Scanner;

public class E_12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el precio del articulo 1: ");
        double precio1 = teclado.nextDouble();

        System.out.print("Ingresa el precio del articulo 2: ");
        double precio2 = teclado.nextDouble();

        System.out.print("Ingresa el precio del articulo 3: ");
        double precio3 = teclado.nextDouble();

        System.out.print("Ingresa el dinero disponible: ");
        double dinero = teclado.nextDouble();

        double total = (precio1 + precio2 + precio3);
        boolean alcanza = (total <= dinero);

        System.out.println("El total es: " + total);
        System.out.println("Alcanza el dinero: " + alcanza);
    }
}

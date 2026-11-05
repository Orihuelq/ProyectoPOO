import java.util.Scanner;

public class E_37 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el precio de costo: ");
        double costo = teclado.nextDouble();

        System.out.print("Ingresa el precio de venta: ");
        double venta = teclado.nextDouble();

        double margen = ((venta - costo) / costo);
        boolean cumple = (margen >= 0.30);

        System.out.println("El margen de ganancia es: " + margen);
        System.out.println("El margen es al menos 30%: " + cumple);
    }
}

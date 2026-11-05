import java.util.Scanner;

public class E_31 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de unidades: ");
        int cantidad = teclado.nextInt();

        System.out.print("Ingresa el precio unitario: ");
        double precio = teclado.nextDouble();

        double total = (cantidad * precio);
        boolean descuento = ((cantidad > 50) && (total > 5000));

        System.out.println("El costo total es: " + total);
        System.out.println("Cumple con el descuento: " + descuento);
    }
}

import java.util.Scanner;

public class E_20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu ingreso mensual: ");
        double ingreso = teclado.nextDouble();

        System.out.print("Ingresa el pago de la tarjeta: ");
        double tarjeta = teclado.nextDouble();

        boolean supera = (tarjeta > (ingreso * 0.30));

        System.out.println("El pago supera el 30% del ingreso: " + supera);
    }
}

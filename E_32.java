import java.util.Scanner;

public class E_32 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa las ventas mensuales: ");
        double ventas = teclado.nextDouble();

        boolean bono = (ventas >= 20000);

        System.out.println("Obtiene bono especial: " + bono);
    }
}

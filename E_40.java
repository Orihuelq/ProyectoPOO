import java.util.Scanner;

public class E_40 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el valor inicial: ");
        double valorInicial = teclado.nextDouble();

        System.out.print("Ingresa el valor de rescate: ");
        double valorRescate = teclado.nextDouble();

        System.out.print("Ingresa los anios de vida util: ");
        int anios = teclado.nextInt();

        double depreciacion = ((valorInicial - valorRescate) / anios);

        System.out.println("La depreciacion anual es: " + depreciacion);
    }
}

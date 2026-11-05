import java.util.Scanner;

public class E_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa los dolares: ");
        double dolares = teclado.nextDouble();

        System.out.print("Ingresa el tipo de cambio: ");
        double tipoCambio = teclado.nextDouble();

        System.out.print("Ingresa el porcentaje de comision: ");
        double comision = teclado.nextDouble();

        double pesos = (dolares * tipoCambio);
        double total = (pesos - (pesos * comision / 100));

        System.out.println("El total neto en pesos es: " + total);
    }
}

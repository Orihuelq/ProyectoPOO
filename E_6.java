import java.util.Scanner;

public class E_6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el cambio en pesos: ");
        int cambio = teclado.nextInt();

        int monedas10 = (cambio / 10);
        int monedas1 = (cambio % 10);

        System.out.println("Monedas de 10 pesos: " + monedas10);
        System.out.println("Monedas de 1 peso: " + monedas1);
    }
}

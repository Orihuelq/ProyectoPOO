import java.util.Scanner;

public class E_48 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el sensor 1 (1 o 0): ");
        int s1 = teclado.nextInt();

        System.out.print("Ingresa el sensor 2 (1 o 0): ");
        int s2 = teclado.nextInt();

        System.out.print("Ingresa el sensor 3 (1 o 0): ");
        int s3 = teclado.nextInt();

        boolean encendidos = ((s1 == 1) && (s2 == 1) && (s3 == 1));

        System.out.println("Los tres sensores estan encendidos: " + encendidos);
    }
}

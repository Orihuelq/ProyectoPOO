import java.util.Scanner;

public class E_18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int a = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int b = teclado.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int c = teclado.nextInt();

        boolean iguales = ((a == b) && (b == c));

        System.out.println("Los tres numeros son iguales: " + iguales);
    }
}

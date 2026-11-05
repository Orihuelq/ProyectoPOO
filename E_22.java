import java.util.Scanner;

public class E_22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        boolean multiplo = ((numero % 4 == 0) && (numero % 6 == 0));

        System.out.println("Es multiplo de 4 y de 6: " + multiplo);
    }
}

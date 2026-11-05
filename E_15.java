import java.util.Scanner;

public class E_15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        boolean resultado = ((numero % 3 == 0) && (numero % 2 != 0));

        System.out.println("Es multiplo de 3 y no de 2: " + resultado);
    }
}

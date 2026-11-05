import java.util.Scanner;

public class E_26 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        boolean resultado = ((numero < 0) && (numero % 2 != 0));

        System.out.println("Es un numero negativo e impar: " + resultado);
    }
}

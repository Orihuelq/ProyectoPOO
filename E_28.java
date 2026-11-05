import java.util.Scanner;

public class E_28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int numero = teclado.nextInt();

        boolean resultado = (numero % 10 != 0);

        System.out.println("No termina en cero: " + resultado);
    }
}

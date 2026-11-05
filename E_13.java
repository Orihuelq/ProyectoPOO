import java.util.Scanner;

public class E_13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        boolean terminaEnCero = (numero % 10 == 0);

        System.out.println("Termina en cero: " + terminaEnCero);
    }
}

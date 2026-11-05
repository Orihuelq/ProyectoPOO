import java.util.Scanner;

public class E_19 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        double numero = teclado.nextDouble();

        boolean negativo = (numero < 0);

        System.out.println("El numero es negativo: " + negativo);
    }
}

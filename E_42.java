import java.util.Scanner;

public class E_42 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero de dos cifras: ");
        int numero = teclado.nextInt();

        int decenas = (numero / 10);
        int unidades = (numero % 10);
        boolean iguales = (decenas == unidades);

        System.out.println("Los dos digitos son iguales: " + iguales);
    }
}

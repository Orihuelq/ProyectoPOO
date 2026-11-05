import java.util.Scanner;

public class E_45 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero de tres cifras: ");
        int numero = teclado.nextInt();

        int centenas = (numero / 100);
        int decenas = ((numero / 10) % 10);
        int unidades = (numero % 10);
        int suma = (centenas + decenas + unidades);

        System.out.println("La suma de sus digitos es: " + suma);
    }
}

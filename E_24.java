import java.util.Scanner;

public class E_24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int n = teclado.nextInt();

        boolean rango = (((n >= 1) && (n <= 10)) || ((n >= 50) && (n <= 60)));

        System.out.println("Esta en uno de los rangos: " + rango);
    }
}

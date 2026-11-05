import java.util.Scanner;

public class E_47 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int n2 = teclado.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int n3 = teclado.nextInt();

        boolean hayPar = ((n1 % 2 == 0) || (n2 % 2 == 0) || (n3 % 2 == 0));

        System.out.println("Al menos un numero es par: " + hayPar);
    }
}

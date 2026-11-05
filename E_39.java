import java.util.Scanner;

public class E_39 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el ingreso anual: ");
        double ingreso = teclado.nextDouble();

        System.out.print("Ingresa el puntaje crediticio: ");
        int puntaje = teclado.nextInt();

        boolean gold = ((ingreso >= 300000) && (puntaje > 700));

        System.out.println("Califica para tarjeta Gold: " + gold);
    }
}

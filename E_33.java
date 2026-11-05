import java.util.Scanner;

public class E_33 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa los minutos de estacionamiento: ");
        int minutos = teclado.nextInt();

        int horas = ((minutos + 59) / 60);
        int total = (horas * 25);

        System.out.println("Horas cobradas: " + horas);
        System.out.println("Total a pagar: $" + total);
    }
}

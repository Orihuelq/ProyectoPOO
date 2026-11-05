import java.util.Scanner;

public class E_23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la hora de 0 a 23: ");
        int hora = teclado.nextInt();

        boolean valida = ((hora >= 0) && (hora <= 23));

        System.out.println("La hora es valida: " + valida);
    }
}

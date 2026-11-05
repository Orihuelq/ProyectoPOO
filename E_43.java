import java.util.Scanner;

public class E_43 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un anio: ");
        int anio = teclado.nextInt();

        boolean bisiesto = (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0));

        System.out.println("Es un anio bisiesto: " + bisiesto);
    }
}

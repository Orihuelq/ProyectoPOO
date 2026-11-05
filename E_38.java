import java.util.Scanner;

public class E_38 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la aportacion del socio A: ");
        double socioA = teclado.nextDouble();

        System.out.print("Ingresa la aportacion del socio B: ");
        double socioB = teclado.nextDouble();

        System.out.print("Ingresa la ganancia total: ");
        double ganancia = teclado.nextDouble();

        double parteA = ((socioA / (socioA + socioB)) * ganancia);

        System.out.println("La ganancia del socio A es: " + parteA);
    }
}

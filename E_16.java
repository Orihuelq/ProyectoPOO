import java.util.Scanner;

public class E_16 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kg: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = teclado.nextDouble();

        double imc = (peso / (estatura * estatura));
        boolean sobrepeso = (imc >= 25.0);

        System.out.println("El IMC es: " + imc);
        System.out.println("IMC mayor o igual a 25: " + sobrepeso);
    }
}

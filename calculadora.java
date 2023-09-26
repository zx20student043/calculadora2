import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Básica - Suma");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);

        System.out.println("Calculadora Básica - Resta");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);


        System.out.println("Calculadora Básica - Mulriplicacion");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);

        scanner.close();
    }
}

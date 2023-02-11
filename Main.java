import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double largest = 0.0;
        int largestPosition = 0;
        for (int i = 0; i < vect.length; i++) {
            if (i == 0) {
                largest = vect[i];
                largestPosition = i;
            }
            else if (vect[i] > largest) {
                largest = vect[i];
                largestPosition = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", largest);
        System.out.println("POSICAO DO MAIOR VALOR = " + largestPosition);

        sc.close();
    }
}
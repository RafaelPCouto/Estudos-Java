import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159, raio, A;

        raio = teclado.nextDouble();

        A = pi * (raio * raio);

        // Imprime diretamente o valor formatado
        System.out.printf("A=%.4f\n", A);

        teclado.close();
    }
}

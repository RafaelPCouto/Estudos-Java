import java.util.Scanner;
import java.lang.Math;

public class BEE1013 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt(), B = teclado.nextInt(), C = teclado.nextInt(), maior;

        maior = (A + B + Math.abs(A - B)) / 2;

        maior = (maior + C + Math.abs(maior - C)) / 2;

        System.out.printf("%d eh o maior\n", maior);

        teclado.close();
    }
}
//Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

import java.util.Scanner;

public class BEE1042{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N1 = teclado.nextInt(), N2 = teclado.nextInt(), N3 = teclado.nextInt();

        if (N1 < N2 && N1 < N3) {
            if (N2 < N3) {
                System.out.printf("%d\n%d\n%d\n", N1, N2, N3);
            } else {
                System.out.printf("%d\n%d\n%d\n", N1, N3, N2);
            }
        } else if (N2 < N1 && N2 < N3) {
            if (N1 < N3) {
                System.out.printf("%d\n%d\n%d\n", N2, N1, N3);
            } else {
                System.out.printf("%d\n%d\n%d\n", N2, N3, N1);
            }
        } else {
            if (N2 < N1) {
                System.out.printf("%d\n%d\n%d\n", N3, N2, N1);
            } else {
                System.out.printf("%d\n%d\n%d\n", N3, N1, N2);
            }
        }

        System.out.printf("\n%d\n%d\n%d\n", N1, N2, N3);

        teclado.close();

    }
}
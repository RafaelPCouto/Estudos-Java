// Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

import java.util.Scanner;

public class BEE1073 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valorN = teclado.nextInt(), quadrado;

        for (int cont = 1; cont <= valorN; cont++) {
            if (cont % 2 == 0) {
                quadrado = cont * cont;
                System.out.printf("%d^2 = %d\n", cont, quadrado);
            }
        }

        teclado.close();
    }
}
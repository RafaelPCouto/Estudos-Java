//Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

import java.util.Scanner;

public class BEE1070 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um valor inteiro, a ser lido e analisado:");   
        int valor = teclado.nextInt();


        if (valor % 2 == 0) {
            valor++;
        }

        for(int index = 0; index < 6; index++) {
            System.out.println(valor);
            valor += 2;
        }

        teclado.close();
    }
}
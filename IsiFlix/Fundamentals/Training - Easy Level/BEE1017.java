import java.util.Scanner;

public class BEE1017 {
    public static void main (String args[]) {

        Scanner teclado = new Scanner(System.in);

        int tempo = teclado.nextInt(), velocidade = teclado.nextInt(), distancia = tempo * velocidade;
        double qtdLitro, rendimento = 12.0;

        qtdLitro = distancia / rendimento;

        System.out.printf("%.3f\n", qtdLitro);
        teclado.close();

    }
}
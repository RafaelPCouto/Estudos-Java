import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorEntrada = teclado.nextDouble();

        int nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda50, moeda25, moeda10, moeda5, valorCalc, valorCents;

        // valorCalc = (valorEntrada * 100) / 100;
        // valorCents = (valorEntrada * 100) % 100;

        nota100 = valorCalc / 100;
        valorCalc = valorCalc % 100;

        nota50 = valorCalc / 50;
        valorCalc = valorCalc % 50;

        nota20 = valorCalc / 20;
        valorCalc = valorCalc % 20;

        nota10 = valorCalc / 10;
        valorCalc = valorCalc % 10;

        nota5 = valorCalc / 5;
        valorCalc = valorCalc % 5;

        nota2 = valorCalc / 2;
        valorCalc = valorCalc % 2;

        System.out.printf("NOTAS:\n%d notas de R$ 100.00\n%d notas de R$ 50.00\n%d notas de R$ 20.00\n%d notas de R$ 10.00\n%d notas de R$ 5.00\n%d notas de R$ 2.00\n", nota100, nota50, nota20, nota10, nota5, nota2);


        teclado.close();
    }
}
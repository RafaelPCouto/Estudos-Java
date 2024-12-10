import java.util.Scanner;

public class BEE1038{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        double valorTotal;

        cod =teclado.nextInt();
        qtde =teclado.nextInt();

        if (cod == 1) {
            valorTotal = qtde * 4.00;
        }
        else if (cod == 2) {
                valorTotal = qtde * 4.50;
            } 
        else if (cod == 3) {
                    valorTotal = qtde * 5.00;
                }
        else if (cod == 4) {
                        valorTotal = qtde * 2.00;
                    }
        else {
                        valorTotal = qtde * 1.50;
                    }

        System.out.printf("Total: R$ %.2f\n", valorTotal);

        teclado.close();
    }
}
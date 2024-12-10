import java.util.Scanner;

public class BEE1038v2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);

        System.out.printf("Digite um valor: ");
        int cod = teclado.nextInt(), qtd = teclado.nextInt();
        double total;

        switch(cod) {
            case 1:
                total = qtd * 4.00;
                break;
            case 2:
                total = qtd * 4.50;
                break;
            case 3:
                total = qtd * 5.00;
                break;
            case 4:
                total = qtd * 2.00;
                break;
            default:
                total = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", total);


        teclado.close();
    }
}
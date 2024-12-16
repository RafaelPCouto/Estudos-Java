import java.util.Scanner;

public class BEE1064{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
            
            double valor, media = 0;
            int numPos = 0;
            for(int contador = 0; contador < 6; contador++) {
                valor = teclado.nextDouble();
                if (valor > 0){
                    numPos++;
                    media += valor;
                }
            }

            media = media / numPos;

            System.out.println(numPos + " valores positivos");
            System.out.printf("%.1f\n", media);

            teclado.close();
    }
}
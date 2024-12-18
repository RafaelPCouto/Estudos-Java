import java.util.Scanner;

public class BEE1114 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha;

        do {
            senha = teclado.nextInt();
            if (senha != 2002) {
                System.out.print("Senha Invalida\n");
            }
        } while (senha != 2002);

        System.out.print("Acesso Permitido");

        teclado.close();
    }
}
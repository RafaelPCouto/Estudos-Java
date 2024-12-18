import java.util.Scanner;

public class TesteVetor{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double notas[]; // Declarando o vetor
        notas = new double[5];

        for (int index = 0; index < notas.length; index++) {
            System.out.println("Digite a nota do aluno "+index);
            notas[index] = teclado.nextDouble();
        }

        for (int index = 0; index < notas.length; index++) {
            System.out.printf("Nota do aluno %d = %.2f\n", index, notas[index]);
        }

        teclado.close();
    }
}
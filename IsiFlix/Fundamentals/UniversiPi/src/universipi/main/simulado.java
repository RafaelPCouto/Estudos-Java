package universipi.main;
import java.util.Scanner;
import universipi.core.Questao;
import universipi.core.QuestaoComDica;
import universipi.core.QuestaoMultiplaEscolha;

public class simulado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pontuacao = 0;
        String minhaResposta;

        Questao questoes[] = new Questao[5];
        questoes[0] = new QuestaoComDica("Quanto é 1 + 1?", "2", "Responda a representação numérica");
        questoes[1] = new Questao("Quem descobriu o Brasil?", "Pedro Alvares Cabral");
        questoes[2] = new QuestaoMultiplaEscolha("Qual a fórmula da água?", "b", "CH4", "O2", "H2O", "AG");
        questoes[3] = new QuestaoComDica("Qual a linguagem deste curso?", "Java", "Começa com \"Ja\" e termina com \"va\"");
        questoes[4] = new Questao("Qual o nome do professor?", "Isidro");

        for (Questao q: questoes) {
            System.out.println(q.aplicarQuestao());
            minhaResposta = teclado.nextLine();
            if(q.corrigir(minhaResposta)) {
                pontuacao++;
                System.out.println("Acertou!!");
            }
            else {
                System.out.println("Errrrroooooooooouuuuuuu!!! (Silva, Fausto)");
            }
        }

        System.out.println("Pontuação total: "+ pontuacao + " de 5");

        teclado.close();

    }
}

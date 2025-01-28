package universipi.core;

public class QuestaoMultiplaEscolha extends Questao {

    private String altA;
    private String altB;
    private String altC;
    private String altD;

    public QuestaoMultiplaEscolha(String enunciado, String resposta, String altA, String altB, String altC, String altD) {
        super(enunciado, resposta);
        this.altA = altA;
        this.altD = altB;
        this.altB = altC;
        this.altC = altD;
    }

    public String templateAlternativas() {
        return "a)" + this.altA + "\n" + "b)" +  this.altB + "\n" + "c)" + this.altC + "\n" + "d)" + this.altD + "\n";
    }

    @Override
    public String aplicarQuestao(){
        return super.aplicarQuestao() + "\n" + this.templateAlternativas();
    }
}

package universipi.core;

public class Questao {

    protected String enunciado;
    protected String resposta;


    public String aplicarQuestao() {
        return "   Q: " + this.enunciado;
    }

    public boolean corrigir(String respAluno) {
        return resposta.equals(respAluno);
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public Questao(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }
}

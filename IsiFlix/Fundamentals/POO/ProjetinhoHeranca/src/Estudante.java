public class Estudante extends Pessoa {
    private int numeroMatricula;
    private String curso;

    public Estudante(String telefone, String email, String nome, int numeroMatricula, String curso) {
        super(telefone, email, nome);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }

    public String exibir() {
        return super.nome + ", "+ super.email + ", " + super.telefone + ", " + this.numeroMatricula + ", " + this.curso;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

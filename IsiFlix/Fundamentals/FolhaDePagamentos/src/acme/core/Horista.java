package acme.core;

public class Horista extends Funcionario {

    private int numeroHoras;
    private float valorHoras;

    public Horista(int numeroRegistro, String nomeFuncionario, int numeroHoras, float valorHoras) {
        super(numeroRegistro, nomeFuncionario);
        this.numeroHoras = numeroHoras;
        this.valorHoras = valorHoras;
    }

    public float calcularSalario() {
        return this.numeroHoras * this.valorHoras;
    }
}

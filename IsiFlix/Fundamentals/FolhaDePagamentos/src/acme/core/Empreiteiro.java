package acme.core;

public class Empreiteiro extends Funcionario {
    private float valorDaEmpreita;

    public Empreiteiro(int numeroRegistro, String nomeFuncionario, float valorDaEmpreita) {
        super(numeroRegistro, nomeFuncionario);
        this.valorDaEmpreita = valorDaEmpreita;
    }

    public float getValorDaEmpreita() {
        return valorDaEmpreita;
    }

    public void setValorDaEmpreita(float valorDaEmpreita) {
        this.valorDaEmpreita = valorDaEmpreita;
    }

    public float calcularSalario() {
        return this.valorDaEmpreita;
    }
}

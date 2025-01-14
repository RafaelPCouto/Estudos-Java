package br.com.isiflix.contaespecial.core;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(int numeroConta, String cpf, String nome, double saldo, double limite) {
		super(numeroConta, cpf, nome, saldo);
		this.limite = limite;
	}
	
	public String toString() {
		return super.numeroConta+ " - "+ super.nomeTitular+ " (" +super.cpfTitular+") R$ "+ super.saldo+ " Limite R$ " + this.limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo-= valor;
			return true;
		}
		return false;
	}
	
	
}


public class Conta {
	
	private int numeroConta, digitoVerificador;
	private String nomeTitular, cpfTitular;
	private double saldo;
	public Conta(int numeroConta, int digitoVerificador, String nomeTitular, String cpfTitular) {
		super();
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String infoConta() {
		return "Conta: "+numeroConta+" / "+digitoVerificador+" - " +nomeTitular+ " ("+cpfTitular+") R$ "+String.format("%.2f", this.saldo);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}


public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	
	public Time(int hora, int minu) {
		super();
		this.hora = hora;
		this.minu = minu;
	}
	
	public Time() {
		super();
	}

	public void setTime(int hora) {
		this.hora = hora;
	}
	
	public String exibirHoraUniversal() {
		return formataNumero(this.hora) + ":" + formataNumero(this.minu) + ":" + formataNumero(this.segu);
	}
	
	public String exibirHoraPadrao() {
		String strHora, sufixo;
		if (this.hora == 12) {
			strHora = "12";
			sufixo = "PM";
		}
		else if (this.hora == 0) {
			strHora = "12";
			sufixo = "AM";
		}
		else if (this.hora >= 1 && this.hora <= 11) {
			strHora = formataNumero(this.hora);
			sufixo = "AM";
		}
		else {
			strHora = String.valueOf(formataNumero(this.hora - 12));
			sufixo = "PM";
		}
		return strHora + ":" + formataNumero(this.minu) + ":" + formataNumero(this.segu) + " " + sufixo;
	}
	
	private String formataNumero(int numero) {
		if (numero < 10) {
			return "0"+numero;
		}
		return String.valueOf(numero);
	}
}

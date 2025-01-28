public abstract class Veiculo {

    protected String marcaModelo;
    protected String ano;

    public Veiculo(String marcaModelo, String ano) {
        this.marcaModelo = marcaModelo;
        this.ano = ano;
    }

    public abstract void acelerar();
    public abstract void frear();


    @Override
    public String toString() {
        return "Veículo [marcaModelo = " + marcaModelo + ", ano = " + ano + "]";
    }
}

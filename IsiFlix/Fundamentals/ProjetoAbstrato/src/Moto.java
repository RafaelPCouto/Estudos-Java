public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marcaModelo, String ano, int cilindradas) {
        super(marcaModelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto " + super.marcaModelo + " acelera no pé! PROPRPOROPROPRORPROPRO");
    }
    public void frear() {
        System.out.println("Moto " + super.marcaModelo + " freia com cuidado!!!");
    }
}

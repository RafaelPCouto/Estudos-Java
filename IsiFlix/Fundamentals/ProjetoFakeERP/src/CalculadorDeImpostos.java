
public class CalculadorDeImpostos implements  InterfaceOracleERP, InterfaceSAP, MSInterface {

    // Aqui temos efetivamente as regras do "segredo do negócio"
    public void calcularImposto(String documentoFiscal) {
        System.out.println("Calculando imposto do documento: " + documentoFiscal);
    }

    @Override
    public void calculateTaxes(String doc) {
        this.calcularImposto(doc);
        System.out.println("Taxes calculated");
    }

    @Override
    public void calculateTaxesAndSumarizeBill(String doc) {
        this.calcularImposto(doc);
    }

    @Override
    public void sumarizeBill(String doc) {
        this.calcularImposto(doc);
    }

    public CalculadorDeImpostos() {
        super();
    }
}

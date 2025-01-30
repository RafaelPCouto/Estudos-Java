public class ERPMainClass {

    public static void main(String[] args) {

        // simulando a chamada da Oracle

        InterfaceOracleERP ioerp = new CalculadorDeImpostos();

        ioerp.calculateTaxes("nf.xml");

        // simulando a chamada da Microsoft

        MSInterface msi = new CalculadorDeImpostos();
        msi.sumarizeBill("bill.xml");

        // simulando a chamada da SAP

        InterfaceSAP isap = new CalculadorDeImpostos();
        isap.calculateTaxesAndSumarizeBill("nf051651.xml");
    }
}

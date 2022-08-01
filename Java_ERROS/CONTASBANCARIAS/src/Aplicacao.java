public class Aplicacao {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.printf("Saldo da cc: %.2f\n", cc.getSaldo());
        System.out.printf("Saldo da cp: %.2f\n", cp.getSaldo());

        // ContaCorrente cc = new ContaCorrente(1, 1);
        // SeguroDeVida sv = new SeguroDeVida();
        // AcaoBolsa ab = new AcaoBolsa();

        // CalculadorImposto ci = new CalculadorImposto();

        // System.out.printf("\nConta Corrente: %.2f" , ci.calcula(cc));
        // System.out.printf("\nSeguro de Vida: %.2f" , ci.calcula(sv));
        // System.out.printf("\nAção da bolsa: %.2f" , ci.calcula(ab));












    }
}

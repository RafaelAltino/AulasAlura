public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    public double calcula(Tributavel t){
        return (1000 + (1000 * t.getValorImposto()));
    }
}

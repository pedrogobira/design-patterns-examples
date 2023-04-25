public class RegistradorDesconto implements Desconto {
    private final Desconto desconto;
    private final DescontosAplicados descontosAplicados;

    public RegistradorDesconto(Desconto desconto, DescontosAplicados descontosAplicados) {
        this.desconto = desconto;
        this.descontosAplicados = descontosAplicados;
    }

    @Override
    public double calcula(double preco, double taxa) {
        double novoValor = desconto.calcula(preco, taxa);
        descontosAplicados.cadastraDesconto(novoValor);
        return novoValor;
    }
}

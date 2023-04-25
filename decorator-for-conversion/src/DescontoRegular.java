public class DescontoRegular implements Desconto {
    @Override
    public double calcula(double preco, double taxa) {
        return preco - preco * taxa;
    }
}

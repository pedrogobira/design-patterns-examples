public class Main {
    public static void main(String[] args) {
        Desconto desconto = new RegistradorDesconto(new DescontoRegular(), new DescontosAplicados());
        System.out.println(desconto.calcula(100, 0.10));
    }
}
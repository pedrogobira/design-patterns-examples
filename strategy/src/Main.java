public class Main {
    public static void main(String[] args) {
        Fretador fretador = new Fretador(new FreteAviao());
        var resultado = fretador.calculaFrete(45300500, 45300400);
        System.out.println(resultado);
    }
}
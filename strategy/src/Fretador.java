import java.math.BigDecimal;

public class Fretador {
    private Frete frete;

    public Fretador(Frete frete) {
        this.frete = frete;
    }

    public BigDecimal calculaFrete(int cepInicial, int cepDestino) {
        return frete.calcula(cepInicial, cepDestino);
    }
}

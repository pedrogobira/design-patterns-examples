import java.math.BigDecimal;

public class FreteOnibus implements Frete {
    private final BigDecimal valorBase = BigDecimal.valueOf(30);

    @Override
    public BigDecimal calcula(int cepInicial, int cepDestino) {
        return valorBase.add(valorBase.multiply(BigDecimal.valueOf(Math.random())));
    }
}

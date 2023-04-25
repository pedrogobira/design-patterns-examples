import java.math.BigDecimal;

public class FreteAviao implements Frete {
    private final BigDecimal valorBase = BigDecimal.valueOf(1000);

    @Override
    public BigDecimal calcula(int cepInicial, int cepDestino) {
        return valorBase;
    }
}

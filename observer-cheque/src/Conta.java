import java.math.BigDecimal;

public class Conta {
    private final long numeroConta;
    private Cliente cliente;
    private BigDecimal saldo;

    private static long geraNumeroConta = 1;

    public Conta(Cliente cliente) {
        numeroConta = geraNumeroConta++;
        this.cliente = cliente;
        saldo = new BigDecimal(0);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}

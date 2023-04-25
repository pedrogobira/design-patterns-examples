import java.math.BigDecimal;

public class Cheque {
    private final Conta pagador;
    private final Conta recebedor;
    private final BigDecimal valor;
    private boolean compensado;

    public Cheque(Conta pagador, Conta recebedor, BigDecimal valor) {
        this.pagador = pagador;
        this.recebedor = recebedor;
        this.valor = valor;
        compensado = false;
    }

    public Conta getPagador() {
        return pagador;
    }

    public Conta getRecebedor() {
        return recebedor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public boolean isCompensado() {
        return compensado;
    }

    public void setCompensado(boolean compensado) {
        this.compensado = compensado;
    }

    @Override
    public String toString() {
        return "Cheque{" + "pagador=" + pagador + ", recebedor=" + recebedor + ", valor=" + valor + ", compensado=" + compensado + '}';
    }
}

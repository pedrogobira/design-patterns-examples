import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ChequeSemFundoLogger chequeSemFundoLogger = new ChequeSemFundoLogger();
        Compensador compensador = new Compensador();
        compensador.adicionaObservador(chequeSemFundoLogger);

        Cliente pagador = new Cliente("João", "Pereira", "12345678910");
        Conta contaPagador = new Conta(pagador);
        contaPagador.setSaldo(BigDecimal.valueOf(1000));

        Cliente recebedor = new Cliente("Maria", "Barreto", "01234567895");
        Conta contaRecebedor = new Conta(recebedor);

        Cheque cheque = new Cheque(contaPagador, contaRecebedor, BigDecimal.valueOf(1000));

        if(!compensador.executa(cheque)) {
            chequeSemFundoLogger.imprime();
        }

        System.out.println("Contas:");
        System.out.println(contaPagador);
        System.out.println(contaRecebedor);
    }
}
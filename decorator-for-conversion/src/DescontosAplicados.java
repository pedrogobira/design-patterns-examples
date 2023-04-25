import java.time.LocalDate;
import java.util.LinkedList;

public class DescontosAplicados {
    private static LinkedList<String> ocorrencias = new LinkedList<>();

    public void cadastraDesconto(double desconto) {
        ocorrencias.add(String.format("Desconto de %f cadastrado em %s", desconto, LocalDate.now()));
    }
}

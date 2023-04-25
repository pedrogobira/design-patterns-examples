import java.util.ArrayList;

public class ChequeSemFundoLogger implements Observador {
    private static final ArrayList<Cheque> cheques = new ArrayList<>();

    public void adiciona(Cheque cheque) {
        cheques.add(cheque);
    }

    public void remove(Cheque cheque) {
        cheques.remove(cheque);
    }

    public void imprime() {
        for (Cheque cheque : cheques) {
            System.out.println(cheque);
        }
    }

    @Override
    public void update(Object object) {
        adiciona((Cheque) object);
    }
}

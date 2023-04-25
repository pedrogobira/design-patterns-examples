import java.util.ArrayList;
import java.util.List;

public abstract class Observavel {
    private final List<Observador> observadores = new ArrayList<>();

    public void adicionaObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removeObservador(Observador observador) {
        observadores.remove(observador);
    }

    protected void notificaObservadores(Object object) {
        for (Observador observador :
                observadores) {
            observador.update(object);
        }
    }
}

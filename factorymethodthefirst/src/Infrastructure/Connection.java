package Infrastructure;

import Domain.Matricula;

import java.util.ArrayList;
import java.util.Arrays;

public class Connection {
    private ArrayList<Matricula> dados = new ArrayList<>(Arrays.asList(new Matricula(1), new Matricula(2), new Matricula(3)));

    public ArrayList<Matricula> getDados() {
        return dados;
    }
}

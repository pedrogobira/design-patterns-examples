package Application;

import Domain.Matricula;
import Domain.MatriculaDAO;
import Infrastructure.Connection;

import java.util.List;

public abstract class ConsultaMatriculaService {
    protected abstract MatriculaDAO make();
    public List<Matricula> getAll() {
        MatriculaDAO dao = make();
        return dao.getAll();
    }
}

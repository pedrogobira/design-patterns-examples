package Infrastructure;

import Domain.Matricula;

import java.util.List;

public class MatriculaDAO implements Domain.MatriculaDAO {
    private final Connection connection;

    public MatriculaDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Matricula> getAll() {
        return connection.getDados();
    }
}

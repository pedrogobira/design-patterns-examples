package Application;

import Domain.MatriculaDAO;
import Infrastructure.Connection;

public class ConsultaMatriculaIFBAService extends ConsultaMatriculaService {

    @Override
    protected MatriculaDAO make() {
        MatriculaDAO dao = new Infrastructure.MatriculaDAO(new Connection());
        return dao;
    }
}

import Application.ConsultaMatriculaIFBAService;
import Domain.Matricula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var service = new ConsultaMatriculaIFBAService();
        List<Matricula> matriculas = service.getAll();
        for (Matricula matricula : matriculas) {
            System.out.println(matricula.getId());
        }
    }
}
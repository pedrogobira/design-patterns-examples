package ifba.app;

import ifba.elementos.Documento;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.DocumentoHTML;
import ifba.elementos.html.RodapeHTML;

import java.util.Date;

public class CriadorDocumentoHTML extends CriadorDocumento {
    @Override
    public Documento make() {
        return new DocumentoHTML(new CabecalhoHTML("Padrões de projeto", "Instituto Federal da Bahia"), new CorpoHTML("Aula de padrões de projeto"), new RodapeHTML(new Date()));
    }
}

package ifba.app;

import ifba.elementos.Documento;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.DocumentoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

import java.util.Date;

public class CriadorDocumentoMarkdown extends CriadorDocumento {

    @Override
    public Documento make() {
        return new DocumentoMarkdown(new CabecalhoMarkdown("Padrões de projeto", "Instituto Federal da Bahia"), new CorpoMarkdown("Aula de padrões de projeto"), new RodapeMarkdown(new Date()));
    }
}

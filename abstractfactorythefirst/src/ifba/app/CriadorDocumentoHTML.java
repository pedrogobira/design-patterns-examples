package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;

import java.util.Date;

public class CriadorDocumentoHTML implements CriadorDocumento {
    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoHTML("Padrões de projeto", "Instituto Federal da Bahia");
    }

    @Override
    public Corpo criaCorpo() {
        return new CorpoHTML("Aula de padrões de projeto");
    }

    @Override
    public Rodape criaRodape() {
        return new RodapeHTML(new Date());
    }
}
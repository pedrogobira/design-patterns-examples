package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

import java.util.Date;

public class CriadorDocumentoMarkdown implements CriadorDocumento {
    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoMarkdown("Padrões de projeto", "Instituto Federal da Bahia");
    }

    @Override
    public Corpo criaCorpo() {
        return new CorpoMarkdown("Aula de padrões de projeto");
    }

    @Override
    public Rodape criaRodape() {
        return new RodapeMarkdown(new Date());
    }
}
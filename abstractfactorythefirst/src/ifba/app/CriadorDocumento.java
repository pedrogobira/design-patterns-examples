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

public interface CriadorDocumento {
	Cabecalho criaCabecalho();
	Corpo criaCorpo();
	Rodape criaRodape();
}

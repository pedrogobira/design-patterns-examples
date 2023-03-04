package ifba.elementos.markdown;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Documento;
import ifba.elementos.Rodape;

public class DocumentoMarkdown implements Documento {
    private Cabecalho cabecalho;
    private Corpo corpo;
    private Rodape rodape;

    public DocumentoMarkdown(Cabecalho cabecalho, Corpo corpo, Rodape rodape) {
        this.cabecalho = cabecalho;
        this.corpo = corpo;
        this.rodape = rodape;
    }

    @Override
    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    @Override
    public void setCabecalho(Cabecalho cabecalho) {
        this.cabecalho = cabecalho;
    }

    @Override
    public Corpo getCorpo() {
        return corpo;
    }

    @Override
    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }

    @Override
    public Rodape getRodape() {
        return rodape;
    }

    @Override
    public void setRodape(Rodape rodape) {
        this.rodape = rodape;
    }
}

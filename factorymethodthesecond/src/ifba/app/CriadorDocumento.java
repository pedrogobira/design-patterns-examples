package ifba.app;

import ifba.elementos.Documento;

public abstract class CriadorDocumento {
    public abstract Documento make();

    public String geraDocumentacao() {
        Documento documento = make();
        return documento.getCabecalho().getOutput() + documento.getCorpo().getOutput() + documento.getRodape().getOutput();
    }
}

package ifba.app;

public class Main {

    public static void main(String[] args) {
        CriadorDocumento criadorDocumentoHTML = new CriadorDocumentoHTML();
        System.out.println(criadorDocumentoHTML.criaCabecalho().getOutput() + criadorDocumentoHTML.criaCorpo()
                .getOutput() + criadorDocumentoHTML.criaRodape().getOutput());

        CriadorDocumento criadorDocumentoMarkdown = new CriadorDocumentoMarkdown();
        System.out.println(criadorDocumentoMarkdown.criaCabecalho().getOutput() + criadorDocumentoMarkdown.criaCorpo()
                .getOutput() + criadorDocumentoMarkdown.criaRodape().getOutput());
    }
}

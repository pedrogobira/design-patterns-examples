package ifba.app;

public class Main {

    public static void main(String[] args) {
        CriadorDocumento criadorDocumentoHTML = new CriadorDocumentoHTML();
        CriadorDocumento criadorDocumentoMarkdown = new CriadorDocumentoMarkdown();
        System.out.println(criadorDocumentoHTML.geraDocumentacao());
        System.out.println(criadorDocumentoMarkdown.geraDocumentacao());
    }
}

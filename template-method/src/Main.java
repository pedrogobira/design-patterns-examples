public class Main {
    public static void main(String[] args) {
        System.out.println("--- IFBA --- ");

        CriadorDocumento criadorDocumento = new CriadorDocumentoIFBA();
        criadorDocumento.criaCabecalho("Teste do Lorem");
        criadorDocumento.criaCorpo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus in aliquam augue. Nunc turpis risus, bibendum non tincidunt ac, fringilla in eros. Nulla aliquet odio eros. Curabitur nulla lorem, hendrerit id viverra sed, tempus et risus. Nunc efficitur arcu mi, scelerisque mollis mauris porta in. Praesent vulputate vestibulum arcu, ut mattis libero semper nec. Suspendisse viverra sem ut urna fermentum tristique vel ut felis. Sed mi risus, pellentesque sit amet nisl sit amet, imperdiet porta nulla. Quisque condimentum turpis ac ultrices bibendum. Proin eget est velit. Praesent rutrum malesuada ligula, ut sodales lectus finibus vel. Etiam eu pretium ipsum. Duis eget nibh ex. Mauris dapibus dui ac egestas facilisis.");
        criadorDocumento.criaRodape("Para IFBA");
        System.out.println(criadorDocumento.getDocumento());

        System.out.println("--- UFBA --- ");

        criadorDocumento = new CriadorDocumentoUFBA();
        criadorDocumento.criaCabecalho("Teste do Lorem");
        criadorDocumento.criaCorpo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus in aliquam augue. Nunc turpis risus, bibendum non tincidunt ac, fringilla in eros. Nulla aliquet odio eros. Curabitur nulla lorem, hendrerit id viverra sed, tempus et risus. Nunc efficitur arcu mi, scelerisque mollis mauris porta in. Praesent vulputate vestibulum arcu, ut mattis libero semper nec. Suspendisse viverra sem ut urna fermentum tristique vel ut felis. Sed mi risus, pellentesque sit amet nisl sit amet, imperdiet porta nulla. Quisque condimentum turpis ac ultrices bibendum. Proin eget est velit. Praesent rutrum malesuada ligula, ut sodales lectus finibus vel. Etiam eu pretium ipsum. Duis eget nibh ex. Mauris dapibus dui ac egestas facilisis.");
        criadorDocumento.criaRodape("Para UFBA");
        System.out.println(criadorDocumento.getDocumento());
    }
}
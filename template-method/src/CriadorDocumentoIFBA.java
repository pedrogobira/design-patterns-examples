public class CriadorDocumentoIFBA extends CriadorDocumento {
    @Override
    public void criaCorpo(String conteudo) {
        documento = String.format("%s\n%s\n", documento, conteudo);
    }
}

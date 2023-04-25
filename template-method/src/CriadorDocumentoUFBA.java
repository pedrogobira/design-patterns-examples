public class CriadorDocumentoUFBA extends CriadorDocumento {
    @Override
    public void criaCorpo(String conteudo) {
        documento = String.format("%s\n<b>%s</b>\n", documento, conteudo);
    }
}

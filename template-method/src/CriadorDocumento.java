public abstract class CriadorDocumento {
    protected String documento;

    public void criaCabecalho(String conteudo) {
        documento = String.format("# %s\n", conteudo);
    }

    public abstract void criaCorpo(String conteudo);

    public void criaRodape(String conteudo) {
        documento = String.format("%s\n%s", documento, conteudo);
    }

    public String getDocumento() {
        return documento;
    }
}

package ifba.elementos;

public interface Documento {
    Cabecalho getCabecalho();
    void setCabecalho(Cabecalho cabecalho);

    Corpo getCorpo();
    void setCorpo(Corpo corpo);

    Rodape getRodape();
    void setRodape(Rodape rodape);
}

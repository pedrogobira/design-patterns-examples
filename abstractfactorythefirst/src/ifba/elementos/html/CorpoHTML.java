package ifba.elementos.html;

import ifba.elementos.Corpo;

public class CorpoHTML implements Corpo {
    private String texto;

    public CorpoHTML(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String getOutput() {
        return "<p>" + getTexto() + "</p>";
    }
}

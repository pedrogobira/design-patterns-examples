package ifba.elementos.markdown;

import ifba.elementos.Cabecalho;

public class CabecalhoMarkdown implements Cabecalho {

    private String titulo;
    private String empresa;

    public CabecalhoMarkdown(String titulo, String empresa) {
        this.titulo = titulo;
        this.empresa = empresa;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getOutput() {
        return "# " + getTitulo() + "\n\n" +
                "## " + getEmpresa() + "\n\n";
    }
}

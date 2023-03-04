package ifba.elementos.markdown;

import ifba.elementos.Corpo;

public class CorpoMarkdown implements Corpo {

	private String texto;

	public CorpoMarkdown(String texto) {
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
		return getTexto() + "\n\n";
	}

}

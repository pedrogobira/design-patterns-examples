package ifba.elementos.markdown;

import ifba.elementos.Rodape;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RodapeMarkdown implements Rodape {
    private Date data;

    public RodapeMarkdown(Date data) {
        this.data = data;
    }

    @Override
    public Date getData() {
        return data;
    }

    @Override
    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String getOutput() {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        return "------------------------------\n\n" + df.format(getData()) + "\n";
    }
}

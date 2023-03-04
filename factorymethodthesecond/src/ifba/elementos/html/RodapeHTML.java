package ifba.elementos.html;

import ifba.elementos.Rodape;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RodapeHTML implements Rodape {
    private Date data;

    public RodapeHTML(Date data) {
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
        return "<hr/>" + df.format(getData()) + "</body></html>\n";
    }
}

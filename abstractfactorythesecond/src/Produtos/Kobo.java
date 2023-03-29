package Produtos;

import java.util.Arrays;
import java.util.List;

public class Kobo implements LivroDigital {
    private final List<String> formatosSuportados = Arrays.asList("EPUB", "MOBI", "PDF");

    @Override
    public List<String> getFormatosSuportados() {
        return formatosSuportados;
    }
}

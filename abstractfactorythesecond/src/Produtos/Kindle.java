package Produtos;

import java.util.Arrays;
import java.util.List;

public class Kindle implements LivroDigital {
    private final List<String> formatosSuportados = Arrays.asList("EPUB", "PDF");

    @Override
    public List<String> getFormatosSuportados() {
        return formatosSuportados;
    }
}

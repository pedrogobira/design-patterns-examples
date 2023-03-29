package Fabricas;

import Produtos.Cultura;
import Produtos.Kobo;
import Produtos.Livraria;
import Produtos.LivroDigital;

public class LivrariaFactoryG2 implements LivrariaFactoryAbstract {
    @Override
    public Livraria criaLivraria() {
        return new Cultura();
    }

    @Override
    public LivroDigital criaLivroDigital() {
        return new Kobo();
    }
}

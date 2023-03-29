package Fabricas;

import Produtos.Amazon;
import Produtos.Kindle;
import Produtos.Livraria;
import Produtos.LivroDigital;

public class LivrariaFactoryG1 implements LivrariaFactoryAbstract {
    @Override
    public Livraria criaLivraria() {
        return new Amazon();
    }

    @Override
    public LivroDigital criaLivroDigital() {
        return new Kindle();
    }
}

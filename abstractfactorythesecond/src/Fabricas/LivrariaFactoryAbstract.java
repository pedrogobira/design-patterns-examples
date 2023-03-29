package Fabricas;

import Produtos.Livraria;
import Produtos.LivroDigital;

public interface LivrariaFactoryAbstract {
    Livraria criaLivraria();

    LivroDigital criaLivroDigital();
}

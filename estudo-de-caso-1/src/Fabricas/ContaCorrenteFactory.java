package Fabricas;

import Produtos.Conta;
import Produtos.ContaCorrente;

public class ContaCorrenteFactory extends ContaFactory {
    @Override
    protected Conta make() {
        return new ContaCorrente();
    }
}

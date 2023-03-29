package Fabricas;

import Produtos.Conta;
import Produtos.ContaPoupanca;

public class ContaPoupancaFactory extends ContaFactory {
    @Override
    protected Conta make() {
        return new ContaPoupanca();
    }
}

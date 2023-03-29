package Fabricas;

import Produtos.Conta;

public abstract class ContaFactory {
    protected abstract Conta make();

    public Conta abreConta() {
        Conta conta = make();
        conta.validaUsuario();
        conta.calculaGanhos();
        conta.registraConta();
        return conta;
    }
}

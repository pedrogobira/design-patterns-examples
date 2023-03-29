package Fabricas;

import Produtos.Conta;
import Produtos.ContaEmpresarial;

public class ContaEmpresarialFactory extends ContaFactory {
    @Override
    protected Conta make() {
        return new ContaEmpresarial();
    }
}

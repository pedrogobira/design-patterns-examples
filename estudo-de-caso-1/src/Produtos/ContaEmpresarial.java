package Produtos;

public class ContaEmpresarial implements Conta {
    @Override
    public void validaUsuario() {
        System.out.println("Usuário empresarial validado");
    }

    @Override
    public void calculaGanhos() {
        System.out.println("Ganhos da conta empresarial calculados");
    }

    @Override
    public void registraConta() {
        System.out.println("Conta empresarial registrada");
    }
}

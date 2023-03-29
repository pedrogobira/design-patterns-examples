package Produtos;

public class ContaCorrente implements Conta {
    @Override
    public void validaUsuario() {
        System.out.println("Usuário correntista validado");
    }

    @Override
    public void calculaGanhos() {
        System.out.println("Ganhos da conta corrente calculados");
    }

    @Override
    public void registraConta() {
        System.out.println("Conta corrente registrada");
    }
}

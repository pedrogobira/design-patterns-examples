package Produtos;

public class ContaPoupanca implements Conta {
    @Override
    public void validaUsuario() {
        System.out.println("Usuário poupança validado");
    }

    @Override
    public void calculaGanhos() {
        System.out.println("Ganhos da poupança calculados");
    }

    @Override
    public void registraConta() {
        System.out.println("Conta poupança registrada");
    }
}

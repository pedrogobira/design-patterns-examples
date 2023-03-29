import Fabricas.ContaCorrenteFactory;
import Fabricas.ContaFactory;
import Produtos.Conta;

public class Cliente {
    public static void main(String[] args) {
        ContaFactory contaFactory = new ContaCorrenteFactory();
        Conta conta = contaFactory.abreConta();
        System.out.println("Referência: " + conta);
    }
}
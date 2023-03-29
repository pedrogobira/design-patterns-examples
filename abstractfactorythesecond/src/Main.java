import Fabricas.LivrariaFactoryAbstract;
import Fabricas.LivrariaFactoryG1;
import Produtos.Livraria;
import Produtos.LivroDigital;

public class Main {
    public static void main(String[] args) {
        LivrariaFactoryAbstract livrariaFactoryAbstract = new LivrariaFactoryG1();
        Livraria livraria = livrariaFactoryAbstract.criaLivraria();
        LivroDigital livroDigital = livrariaFactoryAbstract.criaLivroDigital();

        System.out.println(livraria.getQuantidadeLivros());
        System.out.println(livroDigital.getFormatosSuportados());
    }
}
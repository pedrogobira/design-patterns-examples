package comdecorador;

public class CarroEsportivo extends CarroDecorador {
    public CarroEsportivo(Carro carro) {
        super(carro);
        System.out.println("agora eu tenho recursos de carro de esportivo");
    }

    @Override
    public void construir() {
        super.construir();
    }
}

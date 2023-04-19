package comdecorador;

public class CarroLuxo extends CarroDecorador {
    public CarroLuxo(Carro carro) {
        super(carro);
    }

    @Override
    public void construir() {
        super.construir();
        System.out.println("agora eu tenho recursos de carro de luxo");
    }
}

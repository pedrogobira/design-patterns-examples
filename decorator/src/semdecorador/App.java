package semdecorador;

public class App {

    public static void main(String[] args) {
        Carro carro = new Carro(new CarroEsportivo(), new CarroLuxo());
        carro.getEsportivo().alternarTurbo();
        carro.acelerar();
        carro.getEsportivo().alternarTurbo();
        carro.acelerar();
    }
}

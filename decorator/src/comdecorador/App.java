package comdecorador;

public class App {

    public static void main(String[] args) {
        Carro esporte = new CarroEsportivo(new CarroBasico());
        esporte.construir();

        Carro luxoesporte = new CarroEsportivo(new CarroLuxo(new CarroBasico()));
        luxoesporte.construir();
    }

}

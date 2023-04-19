package semdecorador;

public class Carro {
    private CarroEsportivo esportivo;
    private CarroLuxo luxo;

    public Carro() {

    }

    public Carro(CarroEsportivo carroEsportivo) {
        this.esportivo = carroEsportivo;
    }

    public Carro(CarroLuxo carroLuxo) {
        this.luxo = carroLuxo;
    }

    public Carro(CarroEsportivo carroEsportivo, CarroLuxo carroLuxo) {
        this.esportivo = carroEsportivo;
        this.luxo = carroLuxo;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
        if (esportivo != null && esportivo.getTurbo()) {
            System.out.println("Velocidade aumentada, turbo ativado!");
        }
    }

    public CarroEsportivo getEsportivo() {
        return esportivo;
    }

    public CarroLuxo getLuxo() {
        return luxo;
    }
}


public class LaptopBuilder implements ComputerBuilder {
    private Laptop computer;

    @Override
    public void setProcessor() {
        computer.setProcessor("Processador econômico para dispositivo móvel");
    }

    @Override
    public void setMemory() {
        computer.setMemory("Memória RAM para laptop");
    }

    @Override
    public void setPowerSupply() {
        computer.setPowerSupply("Bateria para dispositivo móvel");
    }

    @Override
    public void setMotherboard() {
        computer.setMotherboard("Placa-mãe para laptop");
    }

    @Override
    public void setStorageUnit() {
        computer.setStorageUnit("Disco rígido para laptop");
    }

    @Override
    public void reset() {
        computer = new Laptop();
    }

    public Laptop getResult() {
        return computer;
    }
}

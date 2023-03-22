public class DesktopBuilder implements ComputerBuilder{
    private Desktop computer;

    @Override
    public void setProcessor() {
        computer.setProcessor("Processador para computador de mesa");
    }

    @Override
    public void setMemory() {
        computer.setMemory("Memória RAM para computador de mesa");
    }

    @Override
    public void setPowerSupply() {
        computer.setPowerSupply("Fonte de energia confiável para computer de mesa");
    }

    @Override
    public void setMotherboard() {
        computer.setMotherboard("Placa-mãe para computador de mesa");
    }

    @Override
    public void setStorageUnit() {
        computer.setStorageUnit("Disco rígido para computador de mesa");
    }

    @Override
    public void reset() {
        computer = new Desktop();
    }

    public Desktop getResult() {
        return computer;
    }
}

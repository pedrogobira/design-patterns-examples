public class Desktop {
    private String processor;

    private String memory;
    private String powerSupply;

    private String motherboard;

    private String storageUnit;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getStorageUnit() {
        return storageUnit;
    }

    public void setStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", storageUnit='" + storageUnit + '\'' +
                '}';
    }
}

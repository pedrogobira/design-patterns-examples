public class Director {
    private ComputerBuilder computerBuilder;

     public Director(ComputerBuilder computerBuilder) {
         this.computerBuilder = computerBuilder;
     }

     public void make() {
         computerBuilder.setPowerSupply();
         computerBuilder.setMotherboard();
         computerBuilder.setProcessor();
         computerBuilder.setMemory();
         computerBuilder.setStorageUnit();
     }

     public void changeBuilder(ComputerBuilder builder) {
         computerBuilder = builder;
     }
}

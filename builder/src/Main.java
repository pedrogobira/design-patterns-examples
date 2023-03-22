public class Main {
    public static void main(String[] args) {
        DesktopBuilder desktopBuilder = new DesktopBuilder();
        LaptopBuilder laptopBuilder = new LaptopBuilder();

        Director director = new Director(desktopBuilder);
        director.make();

        director.changeBuilder(laptopBuilder);
        director.make();

        System.out.println(desktopBuilder.getResult());
        System.out.println(laptopBuilder.getResult());
    }
}
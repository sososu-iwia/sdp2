public final class Main {
    public static void main(String[] args) {
        demo(new GamingFactory());
        System.out.println("---");
        demo(new OfficeFactory());
    }

    private static void demo(ComputerFactory factory) {
        Laptop laptop = factory.createLaptop();
        PersonalComputer pc = factory.createPC();

        laptop.cpu(); laptop.gpu(); laptop.os(); laptop.sold();
        pc.cpu(); pc.gpu(); pc.os(); pc.sold();
    }
}
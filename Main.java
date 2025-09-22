public class Main {
    public static void main(String[] args) {
        ComputerFactory gaming = new GamingFactory();
        ComputerFactory office = new OfficeFactory();

        Computer gamingLaptop = gaming.createLaptop();
        Computer gamingPC = gaming.createPC();

        Computer officeLaptop = office.createLaptop();
        Computer officePC = office.createPC();

        System.out.println(gamingLaptop);
        System.out.println(gamingPC);
        System.out.println(officeLaptop);
        System.out.println(officePC);
    }
}
public class OfficeFactory implements ComputerFactory {
    @Override
    public Computer createLaptop() {
        return new Computer(
                "Office Laptop",
                "Intel Core i5-1240P",
                16,
                "Integrated Graphics",
                "Laptop"
        );
    }

    @Override
    public Computer createPC() {
        return new Computer(
                "Office PC",
                "Intel Core i7-12700",
                16,
                "Integrated Graphics",
                "Desktop"
        );
    }
}
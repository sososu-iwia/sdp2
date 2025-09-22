public class GamingFactory implements ComputerFactory {
    @Override
    public Computer createLaptop() {
        return new Computer(
                "Gaming Laptop",
                "Intel Core i9-13900H",
                32,
                "GeForce RTX 4080 Laptop GPU",
                "Laptop"
        );
    }

    @Override
    public Computer createPC() {
        return new Computer(
                "Gaming PC",
                "AMD Ryzen 9 7950X",
                64,
                "GeForce RTX 4090",
                "Desktop"
        );
    }
}
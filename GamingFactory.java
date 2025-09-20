public final class GamingFactory implements ComputerFactory {
    @Override public Laptop createLaptop()      { return new GamingLaptop(); }
    @Override public PersonalComputer createPC(){ return new GamingPC(); }
}
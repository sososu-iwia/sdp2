public final class OfficeFactory implements ComputerFactory {
    @Override public Laptop createLaptop()      { return new OfficeLaptop(); }
    @Override public PersonalComputer createPC(){ return new OfficePC(); }
}
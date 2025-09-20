public final class OfficePC implements PersonalComputer {
    @Override public void cpu()  { System.out.println("Office PC: CPU installed"); }
    @Override public void gpu()  { System.out.println("Office PC: integrated graphics"); }
    @Override public void os()   { System.out.println("Office PC: OS installed"); }
    @Override public void sold() { System.out.println("Office PC is on sale"); }
}
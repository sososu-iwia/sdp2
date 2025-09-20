public final class GamingPC implements PersonalComputer {
    @Override public void cpu()  { System.out.println("Gaming PC: CPU installed"); }
    @Override public void gpu()  { System.out.println("Gaming PC: GPU installed"); }
    @Override public void os()   { System.out.println("Gaming PC: OS installed"); }
    @Override public void sold() { System.out.println("Gaming PC is on sale"); }
}
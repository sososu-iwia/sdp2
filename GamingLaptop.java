public final class GamingLaptop implements Laptop {
    @Override public void cpu()  { System.out.println("Gaming Laptop: CPU installed"); }
    @Override public void gpu()  { System.out.println("Gaming Laptop: GPU installed"); }
    @Override public void os()   { System.out.println("Gaming Laptop: OS installed"); }
    @Override public void sold() { System.out.println("Gaming Laptop is on sale"); }
}
public final class OfficeLaptop implements Laptop {
    @Override public void cpu()  { System.out.println("Office Laptop: efficient CPU"); }
    @Override public void gpu()  { System.out.println("Office Laptop: integrated GPU"); }
    @Override public void os()   { System.out.println("Office Laptop: OS installed"); }
    @Override public void sold() { System.out.println("Office Laptop is on sale"); }
}
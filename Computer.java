public final class Computer {
    private final String name;
    private final String cpu;
    private final int ramGb;
    private final String gpu;
    private final String formFactor;

    public Computer(String name, String cpu, int ramGb, String gpu, String formFactor) {
        this.name = name;
        this.cpu = cpu;
        this.ramGb = ramGb;
        this.gpu = gpu;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return name +
                " | FormFactor: " + formFactor +
                " | CPU: " + cpu +
                " | RAM: " + ramGb + "GB" +
                " | GPU: " + gpu;
    }
}
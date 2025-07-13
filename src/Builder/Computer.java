package Builder;

class Computer {
    private String cpu, gpu, ram;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public void setRam(String ram) { this.ram = ram; }

    public void show() {
        System.out.println("CPU: " + cpu + ", GPU: " + gpu + ", RAM: " + ram);
    }
}

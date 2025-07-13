package Builder;

 class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();

    public void buildCpu() { computer.setCpu("Intel i7"); }
    public void buildGpu() { computer.setGpu("RTX 4090"); }
    public void buildRam() { computer.setRam("128GB DDR5"); }

    public Computer getComputer() { return computer; }
}

package Builder;

class Director {
    public Computer buildComputer(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildGpu();
        builder.buildRam();
        return builder.getComputer();
    }
}

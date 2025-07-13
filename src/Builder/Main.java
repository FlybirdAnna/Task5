package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Computer gamingPc = director.buildComputer(new GamingComputerBuilder());
        gamingPc.show();
    }
}

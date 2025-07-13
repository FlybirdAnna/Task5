package ChainResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler chain = new HandlerA();
        chain.setNext(new HandlerB());

        chain.handle(5);
        chain.handle(15);
    }
}

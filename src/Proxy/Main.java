package Proxy;

public class Main {
    public static void main(String[] args) {
        Office office1 = new SecurityProxy(true);
        office1.enter();

        Office office2 = new SecurityProxy(false);
        office2.enter();
    }
}

package ChainResponsibility;

class HandlerB extends Handler {
    public void handle(int request) {
        if (request < 20)
            System.out.println("Handled by B");
        else if (next != null)
            next.handle(request);
    }
}

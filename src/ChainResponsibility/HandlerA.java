package ChainResponsibility;

class HandlerA extends Handler {
    public void handle(int request) {
        if (request < 10)
            System.out.println("Handled by A");
        else if (next != null)
            next.handle(request);
    }
}


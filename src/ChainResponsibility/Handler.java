package ChainResponsibility;

abstract class Handler {
    protected Handler next;

    public void setNext(Handler h) { this.next = h; }

    public abstract void handle(int request);
}

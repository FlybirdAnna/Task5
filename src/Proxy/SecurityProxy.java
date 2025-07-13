package Proxy;

class SecurityProxy implements Office {
    private RealOffice office;
    private final boolean hasAccess;

    public SecurityProxy(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public void enter() {
        if (hasAccess) {
            if (office == null) office = new RealOffice();
            office.enter();
        } else {
            System.out.println("Access denied");
        }
    }
}

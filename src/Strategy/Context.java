package Strategy;

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy s) { this.strategy = s; }

    public void execute() { strategy.execute(); }
}
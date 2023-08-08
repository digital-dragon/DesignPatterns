public class Context {
    //This field is context reference to the concrete strategy
    Strategy strategy;


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.execute();
    }
}

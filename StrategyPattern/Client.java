public class Client {
    public static void main(String[] args) {

        //Client creates a context object
        Context context1 = new Context();
        //Passes concrete strategy to the context object
        context1.setStrategy(new ConcreteStrategyA());
        //And executes the particular strategy
        context1.executeStrategy();
        //Client creates a context object
        Context context2 = new Context();
        //Passes concrete strategy to the context object
        context2.setStrategy(new ConcreteStrategyB());
        //And executes the another strategy
        context2.executeStrategy();
    }
}

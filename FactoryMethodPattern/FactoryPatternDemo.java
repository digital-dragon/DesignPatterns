public class FactoryPatternDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.orderProduct();
        Creator creatorB = new ConcreteCreatorB();
        creatorB.orderProduct();
    }
}
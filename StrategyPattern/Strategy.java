//This is the interface that every concrete strategy must implement
public interface Strategy {
    //This the method that context uses to execute the strategy
    public void execute();
}
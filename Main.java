/* @author Balázs H. for university project
*   State Pattern - coffee machine
* */

public class Main {
    public static void main(String[] args) {
        CoffeeContext context = new CoffeeContext();
        State coffeStartState = new CoffeeStartState();
        State coffeStopState = new CoffeeStopState();

        context.setState(coffeStartState);
        context.doAction();

        context.setState(coffeStopState);
        context.doAction();
    }
}

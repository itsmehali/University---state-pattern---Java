public class CoffeeStartState implements State {

    private static CoffeeStartState instance = new CoffeeStartState();

    private CoffeeStartState() {}

    public static CoffeeStartState instance() {
        return instance;
    }

    @Override
    public void updateState(CoffeeContext ctx) {
        System.out.println("Coffee making has began in the coffee cup!");
        ctx.setCurrentState(AddingExtras.instance());
    }
}

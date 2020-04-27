public class CoffeeStopState implements State {

    private static CoffeeStopState instance = new CoffeeStopState();

    private CoffeeStopState() {}

    public static CoffeeStopState instance() {
        return instance;
    }

    @Override
    public void updateState(CoffeeContext ctx) {
        System.out.println("Coffee has been made!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}

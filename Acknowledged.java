public class Acknowledged implements State {

    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {}

    public static Acknowledged instance() {
        return instance;
    }

    @Override
    public void updateState(CoffeeContext ctx) {
        System.out.println("We got the order!");
        ctx.setCurrentState(ReceivingPayment.instance());
    }
}

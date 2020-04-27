public class AddingExtras implements State {

    private static AddingExtras instance = new AddingExtras();

    private AddingExtras() {}

    public static AddingExtras instance() {
        return instance;
    }

    @Override
    public void updateState(CoffeeContext ctx) {
        System.out.println("We are adding extra milk, sugar and little caramel");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}

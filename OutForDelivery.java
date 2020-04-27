public class OutForDelivery implements State {

    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {}

    public static OutForDelivery instance() {
        return instance;
    }

    @Override
    public void updateState(CoffeeContext ctx) {
        System.out.println("Coffee has been delivered for the customer!");
        ctx.setCurrentState(Delivered.instance());
    }
}

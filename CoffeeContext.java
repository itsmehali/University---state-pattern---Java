public class CoffeeContext implements State{
    private State currentState;
    private String orderID;


    public CoffeeContext(State currentState, String orderID) {
        super();
        this.currentState = currentState;
        this.orderID = orderID;

        if(currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void update() {
        currentState.updateState(this);
    }

    @Override
    public void updateState(CoffeeContext ctx) {

    }
}
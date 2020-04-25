public class CoffeeContext implements State{
    private State coffeeState;

    public void setState(State state) {
        this.coffeeState = state;
    }

    public State getState(State state) {
        return this.coffeeState;
    }

    @Override
    public void doAction() {
        this.coffeeState.doAction();
    }
}

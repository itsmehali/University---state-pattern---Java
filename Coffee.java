
/* Without a state pattern =)*/


public class Coffee {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")){
            System.out.println("You got the coffee");
        } else if(state.equalsIgnoreCase("OFF")) {
            System.out.println("You wont get the coffee");
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        coffee.setState("ON");
        coffee.doAction();

        coffee.setState("OFF");
        coffee.doAction();
    }
}

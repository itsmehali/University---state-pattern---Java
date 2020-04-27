import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ReceivingPayment implements State {
    Random rand = new Random();

    private static ReceivingPayment instance = new ReceivingPayment();

    private ReceivingPayment() {}

    public static ReceivingPayment instance() {
        return instance;
    }


    double randomNumber = rand.nextDouble();

    @Override
    public void updateState(CoffeeContext ctx) {

        if (randomNumber <= 0.75) {
            System.out.println("The customer has succesfully paid!");
            ctx.setCurrentState(CoffeeStartState.instance());
        } else {
            System.out.println("The payment failed");
        }
    }
}

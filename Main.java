/* @author Balázs H. for university project
*   State Pattern - coffee machine
* */

public class Main {
    public static void main(String[] args) {
       CoffeeContext ctx = new CoffeeContext(null, "Test123");

       ctx.update();
       ctx.update();
       ctx.update();
       ctx.update();
       ctx.update();
       ctx.update();
    }
}

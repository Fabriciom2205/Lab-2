import org.junit.Test;
import static org.junit.Assert.*;

public class CheesePizzaTest {

    @Test
    public void testCheesePizzaName() {
        CheesePizza pizza = new CheesePizza();
        assertEquals("Cheese Pizza", pizza.name);
    }

    @Test
    public void testPrepare() {
        CheesePizza pizza = new CheesePizza();
        pizza.prepare();
    }

    @Test
    public void testBake() {
        CheesePizza pizza = new CheesePizza();
        pizza.bake();
    }

    @Test
    public void testCut() {
        CheesePizza pizza = new CheesePizza();
        pizza.cut();
    }

    @Test
    public void testBox() {
        CheesePizza pizza = new CheesePizza();
        pizza.box();
    }
}
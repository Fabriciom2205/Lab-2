public class PizzaFactory{
    public Pizza makePizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        } 
        else if ("greek".equalsIgnoreCase(type)) {
            return new GreekPizza();
        } 
        else if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        } 
        else if ("glutenfree".equalsIgnoreCase(type)) {
            return new GlutenFreePizza();
        } 
        else {
            return null;
        }
    }
}
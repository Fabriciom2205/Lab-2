public class GlutenFreePizza implements Pizza {
    public String name;
    public GlutenFreePizza() {
        name = "Glutenfree Pizza";
    }

    public void prepare() {
        System.out.println("Preparing Glutenfree Pizza!");
    }

    public void bake() {
        System.out.println("Baking Glutenfree Pizza!");
    }

    public void cut() {
        System.out.println("Cutting Glutenfree Pizza!");
    }

    public void box() {
        System.out.println("Boxing Glutenfree Pizza!");
    }
}
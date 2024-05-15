public class Pizza {
    private ToppingFactory toppingFactory;

    public Pizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    public void prepare() {
        Topping cheese = toppingFactory.createCheese();
        Topping sauce = toppingFactory.createSauce();
        Topping[] veggies = toppingFactory.createVeggies();
        Topping meat = toppingFactory.createMeat();

        System.out.println("Preparing pizza with:");
        System.out.println(cheese.getName());
        System.out.println(sauce.getName());
        for (Topping veggie : veggies) {
            System.out.println(veggie.getName());
        }
        System.out.println(meat.getName());
    }
}

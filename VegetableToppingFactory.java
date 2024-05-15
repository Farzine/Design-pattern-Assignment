public class VegetableToppingFactory extends ToppingFactory {
    @Override
    public Topping createCheese() {
        return new Cheese();
    }

    @Override
    public Topping createSauce() {
        return new Tomato();
    }

    @Override
    public Topping[] createVeggies() {
        return new Topping[]{new Mushroom()};
    }

    @Override
    public Topping createMeat() {
        return null; // No meat in vegetable pizza
    }
}

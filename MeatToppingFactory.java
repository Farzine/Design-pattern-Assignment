public class MeatToppingFactory extends ToppingFactory {
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
        return null; // No veggies in meat pizza
    }

    @Override
    public Topping createMeat() {
        return new Meat();
    }
}

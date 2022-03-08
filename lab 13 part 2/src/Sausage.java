public class Sausage extends PizzaDecorator{
    public Sausage(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Add sausage");
    }
}


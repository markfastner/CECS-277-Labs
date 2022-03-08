public class Pepperoni extends PizzaDecorator
{
    public Pepperoni(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Add pepperoni");
    }
}
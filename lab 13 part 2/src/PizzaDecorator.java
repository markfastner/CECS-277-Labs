public class PizzaDecorator implements PizzaInt
{
    protected PizzaInt newPizza;
    public PizzaDecorator(PizzaInt decoratedPizza)
    {
        newPizza = decoratedPizza;
    }
    public void makePizza()
    {
        newPizza.makePizza();
    }
}
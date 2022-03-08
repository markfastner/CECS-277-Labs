public class ExtraCheese extends PizzaDecorator{
    public ExtraCheese(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Add extra cheese");
    }
}
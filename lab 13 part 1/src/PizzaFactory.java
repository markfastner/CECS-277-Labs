
public class PizzaFactory {
    public static Pizza orderPizza(String type) {
        //YOUR CODE to create a pizza based on the type.
        Pizza pizza = null;
        if (type.equals("Cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (type.equals("Pepperoni"))
        {
            pizza = new PepperoniPizza();
        }
        pizza.pizzaPrepare();
        return pizza;
    }
}

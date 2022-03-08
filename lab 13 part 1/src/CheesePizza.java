public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        //YOUR CODE to add toppings: "Fresh Mozzarella" and "Parmesan"
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
    @Override
    public void prepare() {
        //Display the following output:
        //Pizza prepare:
        //Add Cheese!!
        //YOUR CODE
        System.out.println("Pizza prepare: Add Cheese!!");
    }
    @Override
    public void bake() {
        //Display the following output:
        //"Bake Cheese Pizza
        System.out.println("Bake Cheese Pizza");
    }

    public String toString()
    { //YOUR CODE to display the following output:
        //name, dough, sauce and toppings
        //Using StringBuffer
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String)toppings.get(i) + "\n");
        }
        return display.toString();
    }
}
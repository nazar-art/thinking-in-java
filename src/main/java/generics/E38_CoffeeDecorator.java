package generics;

import java.awt.Color;

/*
 * Exercise 38: (4) 
 * Create a simple Decorator system by starting with basic coffee, then
 *	providing decorators of steamed milk, foam, chocolate, caramel and whipped cream.
 */

class BasicCoffee {
    private String type;

    public BasicCoffee() {
    }

    public BasicCoffee(String type) {
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class CoffeeDecorator extends BasicCoffee {
    protected BasicCoffee basicCoffee;

    public CoffeeDecorator(BasicCoffee coffee) {
        basicCoffee = coffee;
    }

    public void setType(String type) {
        basicCoffee.setType(type);
    }

    public String getType() {
        return basicCoffee.getType();
    }

}

class SteamedMilk extends CoffeeDecorator {

    public SteamedMilk(BasicCoffee coffee) {
        super(coffee);
        setType(getType() + " & steamed milk ");
    }
}

class Foam extends CoffeeDecorator {

    public Foam(BasicCoffee coffee) {
        super(coffee);
        setType(getType() + "& foam ");
    }
}

class Chocolate extends CoffeeDecorator {
    private final Color color;

    public Chocolate(BasicCoffee coffee, Color color) {
        super(coffee);
        this.color = color;
        setType(getType() + " & chocolate[color = " + getColor() + "]");
    }

    public Color getColor() {
        return color;
    }
}

class Caramel extends CoffeeDecorator {

    public Caramel(BasicCoffee coffee) {
        super(coffee);
        setType(getType() + " & caramel");
    }
}

class WhippedCream extends CoffeeDecorator {

    public WhippedCream(BasicCoffee coffee) {
        super(coffee);
        setType(getType() + " & whipped crem");
    }
}

public class E38_CoffeeDecorator {

    public static void main(String[] args) {

        CoffeeDecorator cappuccino = new Foam(new SteamedMilk(new BasicCoffee(
                "espresso")));

        System.out.println("Capuccino is: " + cappuccino.getType());

        CoffeeDecorator whiteChocolateCoffee = new WhippedCream(new Chocolate(
                new BasicCoffee("hot coffee"), Color.WHITE));

        System.out.println("White Chocolate Coffee is: "
                + whiteChocolateCoffee.getType());
    }
}

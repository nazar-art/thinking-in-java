package generics;

import java.util.ArrayList;

@SuppressWarnings("serial")
class Container extends ArrayList<Product> {

    public Container(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}

@SuppressWarnings("serial")
class CargoHold extends ArrayList<Container> {

    public CargoHold(int nContainers, int nProducts) {
        for (int i = 0; i < nContainers; i++)
            add(new Container(nProducts));
    }
}

class Crane {
}

class CommandSection {
}

@SuppressWarnings("serial")
class CargoShip extends ArrayList<CargoHold> {
    @SuppressWarnings("unused")
    private ArrayList<Crane> cranes = new ArrayList<>();
    @SuppressWarnings("unused")
    private ArrayList<CommandSection> cmd = new ArrayList<>();

    public CargoShip(int nCargoHolds, int nContainers, int nProducts) {
        for (int i = 0; i < nCargoHolds; i++) {
            add(new CargoHold(nContainers, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (CargoHold ch : this) {
            for (Container c : ch) {
                for (Product p : c) {
                    result.append(p);
                    result.append("\n");
                }
            }
        }

        return result.toString();
    }
}

public class E19_CargoShip {
    public static void main(String[] args) {
        new CargoShip(14, 5, 10);
    }
}

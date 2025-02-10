package net.lelyak.generics.coffee;

public class Sweets {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Americano extends Sweets {
}

class Latte extends Sweets {
}

class Mocha extends Sweets {
}

class Cappuccino extends Sweets {
}

class Breve extends Sweets {
}

package typeinfo.pets;

class Person extends Individual {
    public Person(String name) {
        super(name);
    }
}

class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super();
    }
}

class Gerbil extends Pet {
    public Gerbil(String name) {
        super(name);
    }

    public Gerbil() {
        super();
    }
}


class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }
}

class Pet extends Individual {
    public Pet(String name) {
        super(name);
    }

    public Pet() {
        super();
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }
}

class Rodent extends Pet {
    public Rodent(String name) {
        super(name);
    }

    public Rodent() {
        super();
    }
}

class Cymric extends Manx {
    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
        super();
    }
}

class EgyptianMau extends Cat {
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
        super();
    }
}

class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
        super();
    }
}

class Rat extends Rodent {
    public Rat(String name) {
        super(name);
    }

    public Rat() {
        super();
    }
}

class Pug extends Dog {
    public Pug(String name) {
        super(name);
    }

    public Pug() {
        super();
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }
}

public class Manx extends Cat {
    public Manx(String name) {
        super(name);
    }

    public Manx() {
        super();
    }
}

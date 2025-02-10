package net.lelyak.io;

//: net.lelyak.io/Blips.java
// Simple use of Externalizable & a pitfall.

import java.io.*;

import static net.lelyak.mindview.util.Print.*;

class Blip1 implements Externalizable {

    public Blip1() {
        print("Blip1 Constructor");
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip1.writeExternal");
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip1.readExternal");
    }
}

class Blip2 implements Externalizable {

    public Blip2() {
        print("Blip2 Constructor");
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip2.writeExternal");
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip2.readExternal");
    }
}

public class Blips {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        print("Constructing objects:");
        Blip1 b1 = new Blip1();
        Blip2 b2 = new Blip2();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Location.LOC + "Blips.out"));
        print("Saving objects:");
        out.writeObject(b1);
        out.writeObject(b2);
        out.close();

        // Now get them back:
        @SuppressWarnings("resource")
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(Location.LOC + "Blips.out"));
        print("Recovering b1:");
        b1 = (Blip1) in.readObject();
        // OOPS! Throws an exception:
        print("Recovering b2:");
        b2 = (Blip2) in.readObject();
    }
} 

package net.lelyak.courses.io.stream.person;

import java.io.*;

import static net.lelyak.mindview.util.Print.print;

public class App {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();

        new EntityDataOutput(
                new DataOutputStream(buff)).writePerson(
                new Person("Valera Gregorius", 45, new Person.Sex[]{Person.Sex.MALE}));
        byte[] bytes = buff.toByteArray();

        print(bytes.length);
        print(new String(bytes));

        Person p = new EntityDataInput(
                new DataInputStream(
                        new ByteArrayInputStream(bytes))).readPerson();
        print(p);

        buff.flush();
        buff.close();
    }
}

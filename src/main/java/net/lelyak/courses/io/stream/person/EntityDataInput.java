package net.lelyak.courses.io.stream.person;

import java.io.DataInputStream;
import java.io.IOException;

public class EntityDataInput implements EntityInput {
    private final DataInputStream in;

    public EntityDataInput(DataInputStream in) {
        this.in = in;
    }

    @Override
    public Person readPerson() throws IOException {
        String name = in.readBoolean() ? in.readUTF() : null;
        int age = in.readInt();

        boolean sexNotNull = in.readBoolean();
        Person.Sex[] sexArray = null;
        if (sexNotNull) {
            sexArray = new Person.Sex[in.readInt()];
            for (int i = 0; i < sexArray.length; i++) {
                byte sexByte = in.readByte();
                switch (sexByte) {
                    case 0:
                        sexArray[i] = null;
                        break;
                    case 1:
                        sexArray[i] = Person.Sex.FEMALE;
                        break;
                    case 2:
                        sexArray[i] = Person.Sex.MALE;
                        break;
                }
            }
        }
        return new Person(name, age, sexArray);
    }
}

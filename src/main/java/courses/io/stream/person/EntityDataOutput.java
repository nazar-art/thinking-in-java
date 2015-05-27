package courses.io.stream.person;

import java.io.DataOutput;
import java.io.IOException;

public class EntityDataOutput implements EntityOutput {
    private final DataOutput out;

    public EntityDataOutput(DataOutput out) {
        this.out = out;
    }

    @Override
    public void writePerson(Person person) throws IOException {
        out.writeBoolean(person.getName() != null);
        if (person.getName() != null) {
            out.writeUTF(person.getName());
        }
        out.writeInt(person.getAge());

        out.writeBoolean(person.getSex() != null);
        if (person.getSex() != null) {
            out.writeInt(person.getSex().length);
            for (Person.Sex sex : person.getSex()) {
                byte sexByte;
                if (sex == null) {
                    sexByte = 0;
                } else {
                    sexByte = ((sex == Person.Sex.FEMALE) ? (byte) 1 : (byte) 2);
                }
                out.writeByte(sexByte);
            }
        }
    }
}

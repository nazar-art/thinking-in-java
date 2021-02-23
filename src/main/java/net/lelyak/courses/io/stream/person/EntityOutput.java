package net.lelyak.courses.io.stream.person;

import java.io.IOException;

public interface EntityOutput {
    void writePerson(Person person) throws IOException;
}

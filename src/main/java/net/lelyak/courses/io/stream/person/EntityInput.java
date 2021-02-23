package net.lelyak.courses.io.stream.person;

import java.io.IOException;

public interface EntityInput {
    Person readPerson() throws IOException;
}

// Sample of nested net.lelyak.annotations
package net.lelyak.annotations.database;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
} // /:~

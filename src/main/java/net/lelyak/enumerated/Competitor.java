package net.lelyak.enumerated;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
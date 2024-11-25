package main.java.by.rymtsov.lesson15.people;

import java.util.Objects;

/**
 * This class describes a human.
 * It has toString method to output
 * the name of the human
 * and equals and hashCode methods
 * to fill unique humans in the set.
 */

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

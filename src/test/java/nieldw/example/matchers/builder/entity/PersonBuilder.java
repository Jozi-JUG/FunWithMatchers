package nieldw.example.matchers.builder.entity;

import nieldw.example.matchers.entity.Person;

/**
 *
 */
public class PersonBuilder {

    private long id;
    private String name = "default person name";

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder but() {
        return aPerson().withId(id).withName(name);
    }

    public Person build() {
        return new Person(id, name);
    }
}

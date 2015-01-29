package nieldw.example.matchers.entity;

/**
 * A person entity, mapped from the data source.
 */
public class Person {
    private long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

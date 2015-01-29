package nieldw.example.matchers.dto;

import java.io.Serializable;

/**
 * A person entity, mapped from the data source.
 */
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = -1501805880464186967L;

    private long id;
    private String name;

    public PersonDTO(long id, String name) {
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

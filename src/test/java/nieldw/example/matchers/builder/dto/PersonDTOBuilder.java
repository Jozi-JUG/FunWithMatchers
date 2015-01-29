package nieldw.example.matchers.builder.dto;

import nieldw.example.matchers.dto.PersonDTO;

/**
 *
 */
public class PersonDTOBuilder {

    private long id;
    private String name = "default person name";

    private PersonDTOBuilder() {
    }

    public static PersonDTOBuilder aPersonDTO() {
        return new PersonDTOBuilder();
    }

    public PersonDTOBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public PersonDTOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonDTOBuilder but() {
        return aPersonDTO().withId(id).withName(name);
    }

    public PersonDTO build() {
        return new PersonDTO(id, name);
    }
}

package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.PersonDTO;
import nieldw.example.matchers.entity.Person;

/**
 * Transforms {@link Person} objects into {@link PersonDTO}s.
 */
public class PersonDtoFactory {

    public PersonDTO build(Person person) {
        return new PersonDTO(person.getId(), person.getName());
    }
}

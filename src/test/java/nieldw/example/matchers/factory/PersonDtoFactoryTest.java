package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.PersonDTO;
import nieldw.example.matchers.entity.Person;
import org.junit.Test;

import static nieldw.example.matchers.builder.entity.PersonBuilder.aPerson;
import static org.junit.Assert.assertEquals;

public class PersonDtoFactoryTest {

    private static final long PERSON_ID = 111L;
    private static final String SOME_PERSON_NAME = "some person name";

    @Test
    public void testBuild() throws Exception {
        // Set up fixture
        PersonDtoFactory personDtoFactory = new PersonDtoFactory();

        Person person = aPerson()
                .withId(PERSON_ID)
                .withName(SOME_PERSON_NAME)
                .build();

        // Exercise SUT
        PersonDTO personDTO = personDtoFactory.build(person);

        // Verify behaviour
        assertEquals(PERSON_ID, personDTO.getId());
        assertEquals(SOME_PERSON_NAME, personDTO.getName());
    }
}
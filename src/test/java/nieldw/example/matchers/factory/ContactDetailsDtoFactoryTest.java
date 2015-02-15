package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import nieldw.example.matchers.entity.ContactDetails;
import nieldw.example.matchers.entity.Person;
import org.junit.Test;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static nieldw.example.matchers.builder.dto.ContactDetailsDTOBuilder.aContactDetailsDTO;
import static nieldw.example.matchers.builder.entity.ContactDetailsBuilder.aContactDetails;
import static nieldw.example.matchers.builder.entity.PersonBuilder.aPerson;
import static nieldw.example.matchers.matcher.HasContactDetailsDTOBeenCreatedCorrectly.hasSameStateAs;

public class ContactDetailsDtoFactoryTest {

    private static final long CONTACT_DETAILS_ID = 222L;
    private static final long PERSON_ID = 333L;
    private static final String SOME_TELEPHONE_NUMBER = "some telephone number";
    private static final String SOME_CELLPHONE_NUMBER = "some cellphone number";
    private static final String SOME_POSTAL_ADDRESS = "some postal address";
    private static final String SOME_HOME_ADDRESS = "some home address";
    private static final String SOME_PERSON_NAME = "some person name";

    private ContactDetailsDtoFactory contactDetailsDtoFactory;

    @Test
    public void testBuildThinContactDetailsDTO() throws Exception {
        // Set up fixture
        setUpFixture();
        ContactDetails contactDetails = aContactDetails()
                .withId(CONTACT_DETAILS_ID)
                .withPersonId(PERSON_ID)
                .withTelephoneNumber(SOME_TELEPHONE_NUMBER)
                .withCellphoneNumber(SOME_CELLPHONE_NUMBER)
                .withPostalAddress(SOME_POSTAL_ADDRESS)
                .withHomeAddress(SOME_HOME_ADDRESS)
                .build();
        ContactDetailsDTO expectedContactDetails = aContactDetailsDTO()
                .withId(CONTACT_DETAILS_ID)
                .withPersonId(PERSON_ID)
                .withTelephoneNumber(SOME_TELEPHONE_NUMBER)
                .withCellphoneNumber(SOME_CELLPHONE_NUMBER)
                .withPostalAddress(SOME_POSTAL_ADDRESS)
                .withHomeAddress(SOME_HOME_ADDRESS)
                .build();

        // Exercise SUT
        ContactDetailsDTO returnedContactDetailsDTO = contactDetailsDtoFactory.buildThinContactDetailsDTO(contactDetails);

        // Verify behaviour
        assertThat(returnedContactDetailsDTO, hasSameStateAs(expectedContactDetails));
    }

    /**
     * Illustrate shazamcrest with nested object (PersonDTO).
     */
    @Test
    public void testBuild_shouldAlsoPopulatePersonDTO() {
        // Set up fixture
        setUpFixture();
        Person person = aPerson()
                .withId(PERSON_ID)
                .withName(SOME_PERSON_NAME)
                .build();
        ContactDetails contactDetails = aContactDetails()
                .withId(CONTACT_DETAILS_ID)
                .withPersonId(PERSON_ID)
                .withTelephoneNumber(SOME_TELEPHONE_NUMBER)
                .withCellphoneNumber(SOME_CELLPHONE_NUMBER)
                .withPostalAddress(SOME_POSTAL_ADDRESS)
                .withHomeAddress(SOME_HOME_ADDRESS)
                .build();
        ContactDetailsDTO expectedContactDetails = aContactDetailsDTO()
                .withId(CONTACT_DETAILS_ID)
                .withPersonId(PERSON_ID)
                /* ... add PersonDTO ...*/
                .withTelephoneNumber(SOME_TELEPHONE_NUMBER)
                .withCellphoneNumber(SOME_CELLPHONE_NUMBER)
                .withPostalAddress(SOME_POSTAL_ADDRESS)
                .withHomeAddress(SOME_HOME_ADDRESS)
                .build();

        // Exercise SUT
        ContactDetailsDTO returnedContactDetailsDTO = contactDetailsDtoFactory.build(contactDetails, person);

        // Verify behaviour
        /* ... assert ... */
    }

    private void setUpFixture() {
        contactDetailsDtoFactory = new ContactDetailsDtoFactory(new PersonDtoFactory());
    }
}
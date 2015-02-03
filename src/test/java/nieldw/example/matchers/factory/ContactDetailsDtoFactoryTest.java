package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import nieldw.example.matchers.entity.ContactDetails;
import org.junit.Test;

import static nieldw.example.matchers.builder.dto.ContactDetailsDTOBuilder.aContactDetailsDTO;
import static nieldw.example.matchers.builder.entity.ContactDetailsBuilder.aContactDetails;
import static nieldw.example.matchers.matcher.HasContactDetailsDTOBeenCreatedCorrectly.hasSameStateAs;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDetailsDtoFactoryTest {

    private static final long CONTACT_DETAILS_ID = 222L;
    private static final long PERSON_ID = 333L;
    private static final String SOME_TELEPHONE_NUMBER = "some telephone number";
    private static final String SOME_CELLPHONE_NUMBER = "some cellphone number";
    private static final String SOME_POSTAL_ADDRESS = "some postal address";
    private static final String SOME_HOME_ADDRESS = "some home address";

    @Test
    public void testBuildThinContactDetailsDTO() throws Exception {
        // Set up fixture
        ContactDetailsDtoFactory contactDetailsDtoFactory = new ContactDetailsDtoFactory();
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
}
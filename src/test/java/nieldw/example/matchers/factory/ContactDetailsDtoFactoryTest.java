package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import nieldw.example.matchers.entity.ContactDetails;
import org.junit.Test;

import static nieldw.example.matchers.builder.entity.ContactDetailsBuilder.aContactDetails;
import static org.junit.Assert.assertEquals;

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

        // Exercise SUT
        ContactDetailsDTO contactDetailsDTO = contactDetailsDtoFactory.buildThinContactDetailsDTO(contactDetails);

        // Verify behaviour
        assertEquals(CONTACT_DETAILS_ID, contactDetailsDTO.getId());
        assertEquals(PERSON_ID, contactDetailsDTO.getPersonId());
        assertEquals(SOME_TELEPHONE_NUMBER, contactDetailsDTO.getTelephoneNumber());
        assertEquals(SOME_CELLPHONE_NUMBER, contactDetailsDTO.getCellphoneNumber());
        assertEquals(SOME_POSTAL_ADDRESS, contactDetailsDTO.getPostalAddress());
        assertEquals(SOME_HOME_ADDRESS, contactDetailsDTO.getHomeAddress());
    }
}
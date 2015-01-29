package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import nieldw.example.matchers.entity.ContactDetails;

/**
 * Transforms {@link ContactDetails} into {@link ContactDetailsDTO}s.
 */
public class ContactDetailsDtoFactory {

    public ContactDetailsDTO buildThinContactDetailsDTO(ContactDetails contactDetails) {
        return new ContactDetailsDTO(contactDetails.getId(), contactDetails.getPersonId(), contactDetails.getTelephoneNumber(), contactDetails.getCellphoneNumber(), contactDetails.getPostalAddress(), contactDetails.getHomeAddress());
    }

    public ContactDetailsDTO build(ContactDetails contactDetails) {
        return null;
    }
}

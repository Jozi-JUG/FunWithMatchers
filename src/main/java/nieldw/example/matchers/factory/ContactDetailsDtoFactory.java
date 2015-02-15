package nieldw.example.matchers.factory;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import nieldw.example.matchers.entity.ContactDetails;
import nieldw.example.matchers.entity.Person;

/**
 * Transforms {@link ContactDetails} into {@link ContactDetailsDTO}s.
 */
public class ContactDetailsDtoFactory {

    private PersonDtoFactory personDtoFactory;

    public ContactDetailsDtoFactory(PersonDtoFactory personDtoFactory) {
        this.personDtoFactory = personDtoFactory;
    }

    public ContactDetailsDTO buildThinContactDetailsDTO(ContactDetails contactDetails) {
        return new ContactDetailsDTO(contactDetails.getId(), contactDetails.getPersonId(), contactDetails.getTelephoneNumber(), contactDetails.getCellphoneNumber(), contactDetails.getPostalAddress(), contactDetails.getHomeAddress());
    }

    public ContactDetailsDTO build(ContactDetails contactDetails, Person person) {
        ContactDetailsDTO contactDetailsDTO = new ContactDetailsDTO(contactDetails.getId(), contactDetails.getPersonId(), contactDetails.getTelephoneNumber(), contactDetails.getCellphoneNumber(), contactDetails.getPostalAddress(), contactDetails.getHomeAddress());
//        contactDetailsDTO.setPerson(personDtoFactory.build(person));
        return contactDetailsDTO;
    }
}

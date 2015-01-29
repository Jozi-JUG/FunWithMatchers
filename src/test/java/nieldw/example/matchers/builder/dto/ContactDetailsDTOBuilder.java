package nieldw.example.matchers.builder.dto;

import nieldw.example.matchers.dto.ContactDetailsDTO;

/**
 *
 */
public class ContactDetailsDTOBuilder {

    private long id;
    private long personId;
    private String telephoneNumber = "default telephone number";
    private String cellphoneNumber = "default cellphone number";
    private String postalAddress = "default postal address";
    private String homeAddress = "default home address";

    private ContactDetailsDTOBuilder() {
    }

    public static ContactDetailsDTOBuilder aContactDetailsDTO() {
        return new ContactDetailsDTOBuilder();
    }

    public ContactDetailsDTOBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public ContactDetailsDTOBuilder withPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public ContactDetailsDTOBuilder withTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public ContactDetailsDTOBuilder withCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
        return this;
    }

    public ContactDetailsDTOBuilder withPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    public ContactDetailsDTOBuilder withHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public ContactDetailsDTOBuilder but() {
        return aContactDetailsDTO().withId(id).withPersonId(personId).withTelephoneNumber(telephoneNumber).withCellphoneNumber(cellphoneNumber).withPostalAddress(postalAddress).withHomeAddress(homeAddress);
    }

    public ContactDetailsDTO build() {
        return new ContactDetailsDTO(id, personId, telephoneNumber, cellphoneNumber, postalAddress, homeAddress);
    }
}

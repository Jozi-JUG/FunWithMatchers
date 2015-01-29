package nieldw.example.matchers.builder.entity;

import nieldw.example.matchers.entity.ContactDetails;

/**
 *
 */
public class ContactDetailsBuilder {

    private long id;
    private long personId;
    private String telephoneNumber = "default telephone number";
    private String cellphoneNumber = "default cellphone number";
    private String postalAddress = "default postal address";
    private String homeAddress = "default home address";

    private ContactDetailsBuilder() {
    }

    public static ContactDetailsBuilder aContactDetails() {
        return new ContactDetailsBuilder();
    }

    public ContactDetailsBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public ContactDetailsBuilder withPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public ContactDetailsBuilder withTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public ContactDetailsBuilder withCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
        return this;
    }

    public ContactDetailsBuilder withPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    public ContactDetailsBuilder withHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public ContactDetailsBuilder but() {
        return aContactDetails().withId(id).withPersonId(personId).withTelephoneNumber(telephoneNumber).withCellphoneNumber(cellphoneNumber).withPostalAddress(postalAddress).withHomeAddress(homeAddress);
    }

    public ContactDetails build() {
        return new ContactDetails(id, personId, telephoneNumber, cellphoneNumber, postalAddress, homeAddress);
    }
}

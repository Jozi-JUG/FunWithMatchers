package nieldw.example.matchers.dto;

import java.io.Serializable;

/**
 * Contact details, mapped from the data source.
 */
public class ContactDetailsDTO implements Serializable {

    private static final long serialVersionUID = -7073815881715596388L;

    private long id;
    private long personId;
    private PersonDTO person;
    private String telephoneNumber;
    private String cellphoneNumber;
    private String postalAddress;
    private String homeAddress;

    public ContactDetailsDTO(long id, long personId, String telephoneNumber, String cellphoneNumber, String postalAddress, String homeAddress) {
        this.id = id;
        this.personId = personId;
        this.telephoneNumber = telephoneNumber;
        this.cellphoneNumber = cellphoneNumber;
        this.postalAddress = postalAddress;
        this.homeAddress = homeAddress;
    }

    public long getId() {
        return id;
    }

    public long getPersonId() {
        return personId;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
}



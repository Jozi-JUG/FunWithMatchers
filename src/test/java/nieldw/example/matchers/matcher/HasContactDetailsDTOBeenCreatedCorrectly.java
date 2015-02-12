package nieldw.example.matchers.matcher;

import nieldw.example.matchers.dto.ContactDetailsDTO;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;

import java.util.Objects;

/**
 * ContactDetailsDTO matcher.
 */
public class HasContactDetailsDTOBeenCreatedCorrectly extends TypeSafeMatcher<ContactDetailsDTO> {

    private ContactDetailsDTO itemToBeComparedTo;

    public HasContactDetailsDTOBeenCreatedCorrectly(ContactDetailsDTO contactDetailsDTOToCompareTo) {
        this.itemToBeComparedTo = contactDetailsDTOToCompareTo;
    }

    @Override
    protected boolean matchesSafely(ContactDetailsDTO item) {
        return false /* ... check state ... */;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a ContactDetailsDTO with the following state:");
        /* ... describe each field ... */
    }

    @Override
    protected void describeMismatchSafely(ContactDetailsDTO item, Description mismatchDescription) {
        mismatchDescription.appendText("all state fields did not match, mismatched fields are:");
        if (item.getId() != itemToBeComparedTo.getId()) {
            mismatchDescription.appendText("\n\tId: ")
                    .appendText("actual = ").appendValue(item.getId())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getId());
        }
        if (item.getPersonId() != itemToBeComparedTo.getPersonId()) {
            mismatchDescription.appendText("\n\tPersonId: ")
                    .appendText("actual = ").appendValue(item.getPersonId())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getPersonId());
        }
        if (!Objects.equals(item.getCellphoneNumber(), itemToBeComparedTo.getCellphoneNumber())) {
            mismatchDescription.appendText("\nCellphoneNumber: ")
                    .appendText("actual = ").appendValue(item.getCellphoneNumber())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getCellphoneNumber());
        }
        if (!Objects.equals(item.getTelephoneNumber(), itemToBeComparedTo.getTelephoneNumber())) {
            mismatchDescription.appendText("\nTelephoneNumber: ")
                    .appendText("actual = ").appendValue(item.getTelephoneNumber())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getTelephoneNumber());
        }
        if (!Objects.equals(item.getHomeAddress(), itemToBeComparedTo.getHomeAddress())) {
            mismatchDescription.appendText("\nHomeAddress: ")
                    .appendText("actual = ").appendValue(item.getHomeAddress())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getHomeAddress());
        }
        if (!Objects.equals(item.getPostalAddress(), itemToBeComparedTo.getPostalAddress())) {
            mismatchDescription.appendText("\nPostalAddress: ")
                    .appendText("actual = ").appendValue(item.getPostalAddress())
                    .appendText(", expected = ").appendValue(itemToBeComparedTo.getPostalAddress());
        }
    }

    @Factory
    public static HasContactDetailsDTOBeenCreatedCorrectly hasSameStateAs(ContactDetailsDTO contactDetailsDTO) {
        return new HasContactDetailsDTOBeenCreatedCorrectly(contactDetailsDTO);
    }
}

package nieldw.matchers.service;

import nieldw.matchers.Lawn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static nieldw.matchers.LawnBuilder.aLawn;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GreenFingersGardeningTest {

    @Mock
    private HouseService houseService;

    @InjectMocks
    private GreenFingersGardening gardeningSUT;

    @Test
    public void testGetStandardLawn_shouldReturnLawnWithCorrectLength() throws Exception {
        // Set up fixture
        Lawn expectedLawn = aLawn().withLength(2).build();

        // Exercise SUT
        Lawn returnedLawn = gardeningSUT.getStandardLawn();

        // Verify : One field, easy to check
        assertEquals(expectedLawn.getLength(), returnedLawn.getLength());
    }
}
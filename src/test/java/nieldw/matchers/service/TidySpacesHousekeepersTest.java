package nieldw.matchers.service;

import nieldw.matchers.Rooms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TidySpacesHousekeepersTest {

    @Mock
    private HouseService houseService;

    @InjectMocks
    private TidySpacesHousekeepers housekeepersSUT;

    @Test
    public void testGetStandardHouseRooms_shouldReturnRoomsWithStandardHouseValues() throws Exception {
        // Exercise SUT
        Rooms standardHouseRooms = housekeepersSUT.getStandardHouseRooms();

        // Verify behaviour
        assertEquals(3, standardHouseRooms.getBedrooms());
        assertEquals(2, standardHouseRooms.getBathrooms());
        assertEquals(2, standardHouseRooms.getLivingAreas());
        assertEquals(1, standardHouseRooms.getOutdoorAreas());
    }

    // Suppose you have several tests and you have to check all the fields every time?
}
package nieldw.matchers.service;

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
        fail("TODO : Implement test");
    }
}
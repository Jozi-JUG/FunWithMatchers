package nieldw.matchers.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class Hardware2YouTest {

    @Mock
    private HouseService houseService;

    @InjectMocks
    private Hardware2You hardwareSUT;

    @Test
    public void testGetStarterInventory_shouldReturnInventoryWithCorrectValues() throws Exception {
        fail("TODO : Implement test");
    }
}
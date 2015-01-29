package nieldw.matchers.service;

import nieldw.matchers.ShedInventory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Hardware2YouTest {

    @Mock
    private HouseService houseService;

    @InjectMocks
    private Hardware2You hardwareSUT;

    @Test
    public void testGetStarterInventory_shouldReturnInventoryWithCorrectValues() throws Exception {
        // Exercise SUT
        ShedInventory starterInventory = hardwareSUT.getStarterInventory();

        // Verify behaviour
        assertEquals(1, starterInventory.getGloves());
        assertEquals(2, starterInventory.getSpades());
        assertEquals(3, starterInventory.getGardenForks());
        assertEquals(4, starterInventory.getScissors());
        assertEquals(5, starterInventory.getHammers());
        assertEquals(6, starterInventory.getSaws());
        assertEquals(7, starterInventory.getScrewDrivers());
        assertEquals(8, starterInventory.getTongs());
        assertEquals(9, starterInventory.getBrushes());
        assertEquals(10, starterInventory.getClamps());
        assertEquals(11, starterInventory.getLitresPaint());
        assertEquals(12, starterInventory.getLitersVarnish());
        assertEquals(13, starterInventory.getLitersTurpentine());
        assertEquals(14, starterInventory.getLawnMowers());
    }


    // Now imagine another test that must also check the state of the ShedInventory
}
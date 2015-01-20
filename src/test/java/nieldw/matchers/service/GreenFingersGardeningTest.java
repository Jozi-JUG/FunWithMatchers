package nieldw.matchers.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class GreenFingersGardeningTest {

    @Mock
    private HouseService houseService;

    @InjectMocks
    private GreenFingersGardening gardeningSUT;

    @Test
    public void testGetStandardLawn_shouldReturnLawnWithCorrectLength() throws Exception {
        fail("TODO : Implement test");
    }
}
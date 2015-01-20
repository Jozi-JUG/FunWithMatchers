package nieldw.matchers.service;

import nieldw.matchers.ShedInventory;

/**
 * Hardware store that ensures that your shed's inventory is maintained.
 */
public class Hardware2You {
    private HouseService houseService;

    public Hardware2You(HouseService houseService) {
        this.houseService = houseService;
    }

    public ShedInventory getStarterInventory() {
        return new ShedInventory(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
    }
}

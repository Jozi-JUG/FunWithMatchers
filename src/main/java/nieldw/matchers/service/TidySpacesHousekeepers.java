package nieldw.matchers.service;

import nieldw.matchers.Rooms;

/**
 * A small housekeeping business.
 */
public class TidySpacesHousekeepers {
    private HouseService houseService;

    public TidySpacesHousekeepers(HouseService houseService) {
        this.houseService = houseService;
    }

    public Rooms getStandardHouseRooms() {
        return new Rooms(3, 2, 2, 1);
    }
}

package nieldw.matchers.service;

import nieldw.matchers.Lawn;

/**
 * A local gardening service.
 */
public class GreenFingersGardening {
    private HouseService houseService;

    public GreenFingersGardening(HouseService houseService) {
        this.houseService = houseService;
    }

    public Lawn getStandardLawn() {
        return new Lawn(2.2);
    }
}

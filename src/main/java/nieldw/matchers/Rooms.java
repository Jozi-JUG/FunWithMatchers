package nieldw.matchers;

/**
 * A list of room types, with the number of rooms of each type.
 */
public class Rooms {
    private int bedrooms;
    private int bathrooms;
    private int livingAreas;
    private int outdoorAreas;

    public Rooms(int bedrooms, int bathrooms, int livingAreas, int outdoorAreas) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.livingAreas = livingAreas;
        this.outdoorAreas = outdoorAreas;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getLivingAreas() {
        return livingAreas;
    }

    public int getOutdoorAreas() {
        return outdoorAreas;
    }
}

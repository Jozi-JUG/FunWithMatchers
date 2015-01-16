package nieldw.matchers;

/**
 *
 */
public class RoomsBuilder {
    private int bedrooms = 999;
    private int bathrooms = 999;
    private int livingAreas = 999;
    private int outdoorAreas = 999;

    private RoomsBuilder() {
    }

    public static RoomsBuilder aRooms() {
        return new RoomsBuilder();
    }

    public RoomsBuilder withBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }

    public RoomsBuilder withBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public RoomsBuilder withLivingAreas(int livingAreas) {
        this.livingAreas = livingAreas;
        return this;
    }

    public RoomsBuilder withOutdoorAreas(int outdoorAreas) {
        this.outdoorAreas = outdoorAreas;
        return this;
    }

    public RoomsBuilder but() {
        return aRooms().withBedrooms(bedrooms).withBathrooms(bathrooms).withLivingAreas(livingAreas).withOutdoorAreas(outdoorAreas);
    }

    public Rooms build() {
        return new Rooms(bedrooms, bathrooms, livingAreas, outdoorAreas);
    }
}

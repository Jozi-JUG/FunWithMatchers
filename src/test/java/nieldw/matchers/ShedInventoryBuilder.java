package nieldw.matchers;

/**
 *
 */
public class ShedInventoryBuilder {
    private int gloves = 999;
    private int spades = 999;
    private int gardenForks = 999;
    private int scissors = 999;
    private int hammers = 999;
    private int saws = 999;
    private int screwDrivers = 999;
    private int tongs = 999;
    private int brushes = 999;
    private int clamps = 999;
    private int litresPaint = 999;
    private int litersVarnish = 999;
    private int litersTurpentine = 999;
    private int lawnMowers = 999;

    private ShedInventoryBuilder() {
    }

    public static ShedInventoryBuilder aShedInventory() {
        return new ShedInventoryBuilder();
    }

    public ShedInventoryBuilder withGloves(int gloves) {
        this.gloves = gloves;
        return this;
    }

    public ShedInventoryBuilder withSpades(int spades) {
        this.spades = spades;
        return this;
    }

    public ShedInventoryBuilder withGardenForks(int gardenForks) {
        this.gardenForks = gardenForks;
        return this;
    }

    public ShedInventoryBuilder withScissors(int scissors) {
        this.scissors = scissors;
        return this;
    }

    public ShedInventoryBuilder withHammers(int hammers) {
        this.hammers = hammers;
        return this;
    }

    public ShedInventoryBuilder withSaws(int saws) {
        this.saws = saws;
        return this;
    }

    public ShedInventoryBuilder withScrewDrivers(int screwDrivers) {
        this.screwDrivers = screwDrivers;
        return this;
    }

    public ShedInventoryBuilder withTongs(int tongs) {
        this.tongs = tongs;
        return this;
    }

    public ShedInventoryBuilder withBrushes(int brushes) {
        this.brushes = brushes;
        return this;
    }

    public ShedInventoryBuilder withClamps(int clamps) {
        this.clamps = clamps;
        return this;
    }

    public ShedInventoryBuilder withLitresPaint(int litresPaint) {
        this.litresPaint = litresPaint;
        return this;
    }

    public ShedInventoryBuilder withLitersVarnish(int litersVarnish) {
        this.litersVarnish = litersVarnish;
        return this;
    }

    public ShedInventoryBuilder withLitersTurpentine(int litersTurpentine) {
        this.litersTurpentine = litersTurpentine;
        return this;
    }

    public ShedInventoryBuilder withLawnMowers(int lawnMowers) {
        this.lawnMowers = lawnMowers;
        return this;
    }

    public ShedInventoryBuilder but() {
        return aShedInventory().withGloves(gloves).withSpades(spades).withGardenForks(gardenForks).withScissors(scissors).withHammers(hammers).withSaws(saws).withScrewDrivers(screwDrivers).withTongs(tongs).withBrushes(brushes).withClamps(clamps).withLitresPaint(litresPaint).withLitersVarnish(litersVarnish).withLitersTurpentine(litersTurpentine).withLawnMowers(lawnMowers);
    }

    public ShedInventory build() {
        return new ShedInventory(gloves, spades, gardenForks, scissors, hammers, saws, screwDrivers, tongs, brushes, clamps, litresPaint, litersVarnish, litersTurpentine, lawnMowers);
    }
}

package nieldw.matchers;

/**
 * A simple inventory of the shed's contents.
 */
public class ShedInventory {

    private int gloves;
    private int spades;
    private int gardenForks;
    private int scissors;
    private int hammers;
    private int saws;
    private int screwDrivers;
    private int tongs;
    private int brushes;
    private int clamps;
    private int litresPaint;
    private int litersVarnish;
    private int litersTurpentine;
    private int lawnMowers;

    public ShedInventory(int gloves, int spades, int gardenForks, int scissors, int hammers, int saws, int screwDrivers, int tongs, int brushes, int clamps, int litresPaint, int litersVarnish, int litersTurpentine, int lawnMowers) {
        this.gloves = gloves;
        this.spades = spades;
        this.gardenForks = gardenForks;
        this.scissors = scissors;
        this.hammers = hammers;
        this.saws = saws;
        this.screwDrivers = screwDrivers;
        this.tongs = tongs;
        this.brushes = brushes;
        this.clamps = clamps;
        this.litresPaint = litresPaint;
        this.litersVarnish = litersVarnish;
        this.litersTurpentine = litersTurpentine;
        this.lawnMowers = lawnMowers;
    }

    public int getGloves() {
        return gloves;
    }

    public int getSpades() {
        return spades;
    }

    public int getGardenForks() {
        return gardenForks;
    }

    public int getScissors() {
        return scissors;
    }

    public int getHammers() {
        return hammers;
    }

    public int getSaws() {
        return saws;
    }

    public int getScrewDrivers() {
        return screwDrivers;
    }

    public int getTongs() {
        return tongs;
    }

    public int getBrushes() {
        return brushes;
    }

    public int getClamps() {
        return clamps;
    }

    public int getLitresPaint() {
        return litresPaint;
    }

    public int getLitersVarnish() {
        return litersVarnish;
    }

    public int getLitersTurpentine() {
        return litersTurpentine;
    }

    public int getLawnMowers() {
        return lawnMowers;
    }
}

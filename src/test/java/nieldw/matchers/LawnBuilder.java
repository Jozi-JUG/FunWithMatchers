package nieldw.matchers;

/**
 *
 */
public class LawnBuilder {
    private double length = 999.9;

    private LawnBuilder() {
    }

    public static LawnBuilder aLawn() {
        return new LawnBuilder();
    }

    public LawnBuilder withLength(double length) {
        this.length = length;
        return this;
    }

    public LawnBuilder but() {
        return aLawn().withLength(length);
    }

    public Lawn build() {
        return new Lawn(length);
    }
}

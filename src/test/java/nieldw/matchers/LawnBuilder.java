package nieldw.matchers;

/**
 *
 */
public class LawnBuilder {
    private int length = 999;

    private LawnBuilder() {
    }

    public static LawnBuilder aLawn() {
        return new LawnBuilder();
    }

    public LawnBuilder withLength(int length) {
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

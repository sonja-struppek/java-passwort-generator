package de.sonja.security;

public class PasswordConfig {

    private final int length;
    private final boolean useSpecial;

    public PasswordConfig(final int length, final boolean useSpecial) {
        if (length < 8) {
            throw new IllegalArgumentException("Passwortlänge muss mindestens 8 sein.");
        }
        this.length = length;
        this.useSpecial = useSpecial;
    }

    public int getLength() {
        return length;
    }

    public boolean useSpecial() {
        return useSpecial;
    }
}

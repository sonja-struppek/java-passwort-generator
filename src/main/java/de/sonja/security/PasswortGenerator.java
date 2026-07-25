package de.sonja.security;

import java.security.SecureRandom;

public class PasswortGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}<>?";

    public static String generate(int length, boolean useSpecial) {
        StringBuilder charset = new StringBuilder();
        charset.append(LOWER).append(UPPER).append(DIGITS);
        if (useSpecial) charset.append(SPECIAL);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charset.length());
            password.append(charset.charAt(index));
        }

    return password.toString();
    }
}

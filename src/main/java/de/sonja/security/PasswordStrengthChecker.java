package de.sonja.security;

public class PasswordStrengthChecker {

    public static String checkStrength(String password) {
        int score = 0;

        // Länge prüfen
        if (password.length() >= 12) score++;

        // Großbuchstaben
        if (password.matches(".*[A-Z].*")) score++;

        // Kleinbuchstaben
        if (password.matches(".*[a-z].*")) score++;

        // Zahlen
        if (password.matches(".*\\d.*")) score++;

        // Sonderzeichen
        if (password.matches(".*[^A-Za-z0-9].*")) score++;

        // Bewertung
        if (score <= 2) return "schwach";
        else if (score <= 4) return "mittel";
        else return "stark";
    }
}

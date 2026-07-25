package de.sonja.security;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gewünschte Passwortlänge: ");
        int length = scanner.nextInt();

        System.out.print("Sonderzeichen verwenden? (j/n): ");
        boolean useSpecial = scanner.next().equalsIgnoreCase("j");

        // Konfiguration erstellen
        PasswordConfig config = new PasswordConfig(length, useSpecial);

        // Passwort generieren
        String password = PasswortGenerator.generate(config.getLength(), config.useSpecial());

        // Stärke prüfen
        String strength = PasswordStrengthChecker.checkStrength(password);

        // Ausgabe
        System.out.println("\nGeneriertes Passwort: " + password);
        System.out.println("Passwortstärke: " + strength);

        scanner.close();
    }
}
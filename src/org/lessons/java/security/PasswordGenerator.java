package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String lastName = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String favoriteColor = scanner.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        int monthOfBirth = scanner.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        int yearOfBirth = scanner.nextInt();

        int dateSum = dayOfBirth + monthOfBirth + yearOfBirth;

        String generatedPassword = '"' + firstName + '-' + lastName + '-' + favoriteColor + '-' + dateSum + '"';

        System.out.println("La password generata per te è: " + generatedPassword);

        scanner.close();

    }

}
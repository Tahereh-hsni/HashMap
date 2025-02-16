package UppgiftFeb;

import java.util.HashMap;

public class MorshLoghic {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String morsh = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";

    public static HashMap<String, String> morshKod = new HashMap<>();

    public static void buildMorseKod() {
        String[] morsheArray = morsh.split(" ");

        for (int i = 0; i < alphabet.length(); i++) {
            String lettr = String.valueOf(alphabet.charAt(i));
            morshKod.put(lettr, morsheArray[i]);
            morshKod.put(morsheArray[i], lettr);
        }
    }


    public static String convertSingleCharacter(String input) {
        try {
                if (input == null || input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be null or empty");
                }

                if (input.length() != 1) {
                    throw new IllegalArgumentException("Please write just one character");
                }

                if (morshKod.containsKey(input.toUpperCase())) {
                    return morshKod.get(input.toUpperCase());
                } else {
                    throw new IllegalArgumentException("Character not found in Morse code");
                }

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }




    public static String textToMorsh(String text) { //ABC
        String morseString = ""; //skapa en tom strang for att visa morse

        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i)).toUpperCase();
            if (morshKod.containsKey(letter)) {
                morseString += morshKod.get(letter) + " ";
            }
        }
        return morseString.trim();
    }


    public static String morshToText(String morse) {

        String[] morshArray = morse.split(" ");
        StringBuilder textString = new StringBuilder();

        for (String morseSymbol : morshArray) {
            if (morshKod.containsKey(morseSymbol)) {
                textString.append(morshKod.get(morseSymbol));

            }
        }return textString.toString();
    }

}
















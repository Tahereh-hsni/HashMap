package UppgiftFeb;

import java.security.PublicKey;
import java.util.Scanner;

import static UppgiftFeb.MorshLoghic.buildMorseKod;
import static UppgiftFeb.MorshLoghic.convertSingleCharacter;

public class MorshMain {

    public static void main(String[] args) {
        MorshLoghic.buildMorseKod();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" Write en charecter from (A to Z:)");
            String inputCharecter = scanner.nextLine();

            String resultCharecter = MorshLoghic.convertSingleCharacter(inputCharecter);
            if (!resultCharecter.startsWith("Error")) {
                System.out.println(resultCharecter);
                break;
            } else {
                System.out.println( resultCharecter);

            }
        }


        System.out.println(" Write text for convert to morse");
        String inputText = scanner.nextLine();
        String morseResult = MorshLoghic.textToMorsh(inputText);
        System.out.println("Morse-Kod :" + morseResult);


        System.out.println(" Write MorseKod to convert to text");
        String morse = scanner.nextLine();
        String  StringResult = MorshLoghic.morshToText(morse);
        System.out.println(" Morse-kod :" + StringResult);

        scanner.close();

    }

}

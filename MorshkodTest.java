package UppgiftFeb;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MorshkodTest {

    //".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
    @Test
    public void testcharA() {
        MorshLoghic.buildMorseKod();
        assertEquals(".-", MorshLoghic.convertSingleCharacter("A"));
    }

    @Test
    public void testcharZ() {
        MorshLoghic.buildMorseKod();
        assertEquals("--..", MorshLoghic.convertSingleCharacter("Z"));
    }

    @Test
    public void testHELLO() {
        MorshLoghic.buildMorseKod();
        assertEquals(".... . .-.. .-.. ---", MorshLoghic.textToMorsh("Hello"));
    }


    @Test
    public void testUtvecklare() {
        MorshLoghic.buildMorseKod();
        assertEquals("..- - ...- . -.-. -.- .-.. .- .-. .", MorshLoghic.textToMorsh("Utvecklare"));
    }
    @Test
    public void testMorsh(){
        MorshLoghic.buildMorseKod();
        assertEquals("JAVA",MorshLoghic.morshToText(".--- .- ...- .-"));

    }
}



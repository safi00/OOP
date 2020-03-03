package Practicum3B.src.Practicum.PRC2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    private Voetbalclub v1;
    private Voetbalclub v2;

    @BeforeEach
    public void init() {
        System.out.println("intit");
        v1 = new Voetbalclub("Ronald");

    }

    /* Eis 2 & 4 */

    @Test
    void puntenTotaal() {
        System.out.println("puntenTotaal");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        assertEquals(14, v1.aantalPunten());
        assertEquals(8, v1.aantalGespeeld());
        assertEquals(4, v1.aantalGewonnen());
        assertEquals(2, v1.aantalGelijk());
        assertEquals(2, v1.aantalVerloren());
    }

    @Test
    void gewonnenPunten() {
        System.out.println("gewonnenPunten");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());
        v1.verwerkResultaat('w');
        assertEquals(2, v1.aantalGewonnen());
        assertEquals(2, v1.aantalGespeeld());
    }

    @Test
    void gelijkPunten() {
        System.out.println("gelijkPunten");
        v1.verwerkResultaat('g');
        assertEquals(1, v1.aantalPunten());
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        assertEquals(5, v1.aantalGelijk());
        assertEquals(6, v1.aantalGespeeld());
        assertEquals(5, v1.aantalPunten());
    }

    @Test
    void verlorenPunten() {
        System.out.println("verlorenPunten");
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        assertEquals(0, v1.aantalPunten());
        assertEquals(3, v1.aantalGespeeld());
        assertEquals(3, v1.aantalVerloren());
    }

    @Test
    void verwerkResultaatElse() {
        System.out.println("verwerkResultaatElse");
        v1.verwerkResultaat('x');
        assertEquals(0, v1.aantalPunten());
        assertEquals(0, v1.aantalGespeeld());
    }

    /* Eis 1 */

    @Test
    void clubnaamNull() {
        System.out.println("clubnaamNull");
        v2 = new Voetbalclub(null);
        assertEquals("FC", v2.toString().substring(0,2));
    }

    @Test
    void clubnaamLeeg() {
        System.out.println("clubnaamLeeg");
        v2 = new Voetbalclub("");
        assertEquals("FC", v2.toString().substring(0,2));
    }

    /* Eis 3 */

    @Test
    void puntenInDeToString() {
        System.out.println("puntenInDeToString");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        assertEquals("Ronald 8 4 2 2 14", v1.toString());
    }
}

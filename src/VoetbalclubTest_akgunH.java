import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class VoetbalclubTest_akgunH{
    private Voetbalclub testclub;

    @BeforeEach
    public void Voetbalclub(){
        testclub = new Voetbalclub("FC Utrecht");
    }
    @Test
    public void legeClubNaam() {
        Voetbalclub voetbalclub = new Voetbalclub("");
        assertTrue(voetbalclub.toString().startsWith("FC"));
    }

    @Test
    public void verwerkEenVerlies() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('v');
        assertEquals(0, voetbalclub.aantalPunten());
    }

    @Test
    public void verwerkEenGelijkspel() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('g');
        assertEquals(1, voetbalclub.aantalPunten());
    }

    @Test
    public void verwerkEenWin() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('w');
        assertEquals(3, voetbalclub.aantalPunten());
    }

    @Test
    public void verwerkEenVerliesGelijkspelWin() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        assertEquals("FC 3 1 1 1 4", voetbalclub.toString());
    }

    @Test
    public void testVerwerkenResulatenOptelling(){
        testclub.verwerkResultaat('w');
        testclub.verwerkResultaat('g');
        testclub.verwerkResultaat('g');
        assertEquals(5, testclub.aantalPunten(), "De optelling werkt niet");
    }

}
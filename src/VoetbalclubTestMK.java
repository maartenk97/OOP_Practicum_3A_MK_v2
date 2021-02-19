import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTestMK {
    private Voetbalclub v;
    private Voetbalclub v2;
    private Voetbalclub v3;

    @BeforeEach
    public void Voetbalclub(){
        v = new Voetbalclub (null);
        v2 = new Voetbalclub("");
        v3 = new Voetbalclub("FC Utrecht");
    }

    @Test
    public void testVoetbalclubNaam(){
        assertEquals("FC", v.getNaam(), "Foutieve invoer");
    }
    @Test
    public void testVoetbalclubNaam2(){
        assertEquals("FC", v2.getNaam(), "Foutieve invoer");

    }
    @Test
    public void testVerwerkenResultatenPunten(){
        v.verwerkResultaat('f');
        v.verwerkResultaat('b');
        v.verwerkResultaat('q');
        assertEquals(0, v.aantalPunten() + v3.aantalGespeeld(), "Foutieve invoer");

    }

    @Test
    public void testVerwerkenResulatenToString(){
        v3.verwerkResultaat('f');
        assertEquals( "FC Utrecht" + " " + 0 + " " + 0 + " " + 0
                + " " + 0 + " " + 0, v3.toString(), "foutieve invoer");
    }
    @Test
    public void testVerwerkenResulatenOptelling(){
        v3.verwerkResultaat('w');
        v3.verwerkResultaat('g');
        v3.verwerkResultaat('g');
        assertEquals(5, v3.aantalPunten(), "De optelling werkt niet");
    }
    @Test
    public void testVerwerkenResultatenOptelling2(){
        v3.verwerkResultaat('w');
        v3.verwerkResultaat('g');
        v3.verwerkResultaat('g');
        assertEquals(10, v3.aantalPunten(), "De optelling werkt niet" );
    }



}
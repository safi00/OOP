package Practicum04;

import Week02.Practicum04.AutoB;
import Week02.Practicum04.AutoHuurB;
import Week02.Practicum04.KlantB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {
    private KlantB h;
    private AutoHuurB aH1;

    @BeforeEach
    public void init() {
        System.out.println("init");
        aH1 = new AutoHuurB();
        h = new KlantB("Mijnheer de Vries");
    }

    @Test
    void geenHuurderGeenAuto() {
        System.out.println("geenHuurderGeenAuto");
        assertEquals(null, aH1.getGehuurdeAuto());
        assertEquals(null, aH1.getHuurder());
    }

    @Test
    void welHuurderGeenAuto() {
        System.out.println("welHuurderGeenAuto");
        KlantB k = new KlantB("Mijnheer de Vries");
        aH1.setHuurder(k);
        assertEquals(null, aH1.getGehuurdeAuto());
      //  assertEquals("op naam van: Mijnheer de Vries (korting: 0.0%)", aH1.getHuurder());
        assertEquals(h.toString(), aH1.getHuurder());
    }
}

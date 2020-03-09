package Practicum04;

import Week02.Practicum04.AutoB;
import Week02.Practicum04.AutoHuurB;
import Week02.Practicum04.KlantB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {
    private AutoHuurB aH1;

    @BeforeEach
    public void init() {
        System.out.println("init");
        aH1 = new AutoHuurB();

        AutoB a = new AutoB("Ferrari", 5000.00);
        KlantB b = new KlantB("Mijnheer de Vries");

        aH1.setGehuurdeAuto(a);
        aH1.setHuurder(b);
    }

    @Test
    void geenHuurderGeenAuto() {
        System.out.println("geenHuurderGeenAuto");
        aH1.setHuurder(null);
        aH1.setGehuurdeAuto(null);

        assertEquals(("er is geen auto bekend\n" + "er is geen huurder bekend\n"+ "aantal dagen: 1 en dat kost 0.0"), aH1.toString());

    }

    @Test
    void geenHuurderWelAuto(){
        System.out.println("geenHuurderWelAuto");
        aH1.setHuurder(null);

        assertEquals("autotype: Ferrari met prijs per dag: 5000.0\n" + "er is geen huurder bekend\n"+ "aantal dagen: 1 en dat kost 0.0", aH1.toString());
    }

    @Test
    void welHuuderWelAuto(){
        System.out.println("welHuurderWelAuto");

        assertEquals("autotype: Ferrari met prijs per dag: 5000.0\n" + "op naam van: Mijnheer de Vries (korting: 0.0%)\n"+ "aantal dagen: 1 en dat kost 5000.0", aH1.toString());
    }

    @Test
    void huurderMetKorting() {
        System.out.println("huurderMetKorting");
        KlantB k = new KlantB("Jan");
        aH1.setHuurder(k);
        k.setKorting(10);
        assertEquals("autotype: Ferrari met prijs per dag: 5000.0\n" + "op naam van: Jan (korting: 10.0%)\n"+ "aantal dagen: 1 en dat kost 4500.0", aH1.toString());
    }
}

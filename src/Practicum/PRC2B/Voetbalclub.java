package Practicum.PRC2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;
    private int aantalPunten = 0;
    private int aantalGespeeld = 0;

    public Voetbalclub (String name){naam = name;}

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;}

    public int aantalPunten() {aantalPunten = ( aantalGewonnen * 3 ) + aantalGelijk;return aantalPunten;}

    public int aantalGespeeld() {aantalGespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;return aantalGespeeld;}

    public int aantalGewonnen() {return aantalGewonnen;}

    public int aantalGelijk() {return aantalGelijk;}

    public int aantalVerloren() {return aantalVerloren;}

    public String toString(){String x =naam+" "+aantalGespeeld()+" "+aantalGewonnen()+" "+aantalGelijk()+" "+aantalVerloren()+" "+aantalPunten();return x;}
}


package Practicum.les1.opdr3;

public class Student {
    private String naam;
    private String nummer;
    private String adr;

    public Student (String name, String number, String adrs){naam = name;nummer = number;adr = adrs;}
    public String getNaam() {return naam;}
    public String getNummer() {return nummer;}
    public String getAdr() {return adr;}

    public void setNaam(String nwName){ naam = nwName; }
    public void setNummer(String nwNumber){ nummer = nwNumber; }
    public void setAdr(String nwAdrs){ adr = nwAdrs; }

    public String toString(){String x = "Deze student heet : " + naam + "en zijn nummer is " + nummer + " op " + adr + "\n";return x;}
}

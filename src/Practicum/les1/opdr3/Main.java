package Practicum.les1.opdr3;

public class Main {
    public static void main(String[] arg)
    {
        Student std1 = new Student("Xarvaine","001","nowhere");
        Student std2 = new Student("chris","002","somewhere");

        System.out.println(std1);
        System.out.println(std1.getNaam());
        System.out.println(std1.getNummer());
        System.out.println(std1.getAdr());
        System.out.println(std1.toString());
        System.out.println(std2);
        System.out.println(std2.getNaam());
        System.out.println(std2.getNummer());
        System.out.println(std2.getAdr());
        System.out.println(std2.toString());

        Student st1 = new Student("Sylvester","003","dad");

        System.out.println( "name: " + st1.getNaam() );
        System.out.println( "number: " + st1.getNummer() );
        System.out.println( "toString: " + st1.toString() );

        Student st2 = new Student("Karel","009","ded");

        st1.setAdr("Vreegburg 38");
        st2.setAdr("Oudenoord 340");

        System.out.println( "name: " + st2.getNaam() );
        System.out.println( "number: " + st2.getNummer() );
        System.out.println( "toString: " + st2.toString() );
    }
}

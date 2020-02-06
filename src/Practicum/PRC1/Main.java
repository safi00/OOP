package Practicum.PRC1;

import java.util.Random;

class CountFor {
    public static void main(String[] args){
        for(int getal=1; getal<11; getal++){
            System.out.println("het (FOR) getal is nu: " + getal);
        }
    }
}

class CountWhile {
    public static void main(String[] args){
        int nummer = 1;
        while (nummer < 11) {
            System.out.println("het (WHILE) getal is nu: " + nummer);
            nummer++;
        }
    }
}

class RandomNumberDEC {
    public static void main(String[] args){
        int nummer = 1;
        while (nummer < 11) {
            double f = Math.random();
            System.out.println("het (WHILE) getal is nu: " + f);
            nummer++;
        }
    }
}

class RandomNumberINT {
    public static void main(String[] args){
        int nummer = 1;
        while (nummer < 11) {
            Random rand = new Random();

            int rand_int = rand.nextInt(10);
            System.out.println("het (WHILE) getal is nu: " + rand_int);
            nummer++;
        }
    }
}

class Count39andsom{
    public static void main(String[] args){
        int nummer = 0;
        int sum = 0;
        while (nummer < 40) {
            sum = sum + nummer;
            System.out.println(sum);
            nummer++;
        }
    }
}

class Zaag {
    public static void main(String[] args) {
        int nummer = 0;
        while (nummer < 10) {
            if (nummer % 2 == 0)
                System.out.println("s");
            else
                System.out.println("ss");
            nummer++;
        }
    }
}
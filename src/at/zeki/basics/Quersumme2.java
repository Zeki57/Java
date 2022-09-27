package at.zeki.basics;

public class Quersumme2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            int num3 = i;
            int Quersumme = 0;
            while (num3>0){
                Quersumme += num3%10;
                num3 /= 10;
            }
            if (Quersumme%7==0)
                System.out.printf("");
        }
    }
}
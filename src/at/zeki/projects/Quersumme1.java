package at.zeki.projects;

public class Quersumme1 {
    public static void main(String[] args) {
        for (int zahl = 0; zahl < 1000; zahl++) {
            int zahl2 = zahl;
            int ziffernsumme = 0;
            while (zahl2>0){
                ziffernsumme += zahl2%10;
                zahl2 /= 10;
            }
            if (ziffernsumme==15){
                System.out.println("Zahl: " + zahl + " summe: " + ziffernsumme);
            }
        }
    }
}
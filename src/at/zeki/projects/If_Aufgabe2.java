package at.zeki.projects;
import java.util.Random;

public class If_Aufgabe2 {

    public static void main(String[]args){
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        if ((randomNumber1<randomNumber2) && (randomNumber1<50)){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }else if ((randomNumber1>30) && (randomNumber2>30)){
            System.out.println("Eine der beiden ist kleiner als 30");
        }else if ((randomNumber1>50) && (randomNumber2!=50)) {
            System.out.println("Erster Zahl klein, Zeweite kein 5iger");
        }
    };

}

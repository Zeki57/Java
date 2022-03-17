package at.zeki.basics;
import java.util.Random;

public class If_Aufgabe2 {
    public static void main(String[]args){
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        if ((randomNumber1<randomNumber2) && (randomNumber1<50)){
            System.out.println();
        }
    }
}

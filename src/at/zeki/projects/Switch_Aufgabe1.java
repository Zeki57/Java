package at.zeki.projects;

import java.util.Random;

public class Switch_Aufgabe1 {
    public static void main(String[]args){
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
        }
    }

}

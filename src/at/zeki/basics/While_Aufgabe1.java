package at.zeki.basics;

import java.util.Random;

public class While_Aufgabe1 {
    public static void main(String[]args){
        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished){
            int randomValue = random.nextInt(10,31);
            System.out.println("Nr:" + randomValue);

            if((randomValue=10) || (randomValue=25)){
                isFinished=true;
            }

        }
        System.out.println("Finished");
    }


}

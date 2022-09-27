package at.zeki.basics;

import java.util.Random;

public class If_bedinung {
    public static void main(String[] agrs) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if ((randomNumber>50) && (randomNumber<90)){

        } else if (randomNumber<10){
            System.out.println("in");
        };


    }
}

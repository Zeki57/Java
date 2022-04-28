package at.zeki.basics;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[]args){

        boolean exit = false;
        int input = 0;
        int Zahl = 0;

        Scanner scanner = new Scanner (System.in);

        System.out.println();
        System.out.println("Drücken sie 1 um zu spielen");
        System.out.println("Drücken sie 2 Um den Aktuellen Stand zu sehen");
        System.out.println("Drücken sie 3 um das Spiel zu Beenden");


        while (!exit){

            input = scanner.nextInt();

            Random random = new Random();
            int randomNumber1 = random.nextInt(0,7);
            int randomNumber2 = random.nextInt(0,7);

            switch (randomNumber1){

                case 1:
                    for (int i = 1; i < 7; i=i+1) {

                    }
            }

        }

    }
}

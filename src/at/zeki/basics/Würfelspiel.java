package at.zeki.basics;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Würfelspiel {

    public static void main(String[] args) {

        boolean exit = false;
        int Input = 0;
        int sum1 = 0;
        int sum2 = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Drücken sie 1 um zu spielen");
        System.out.println("Drücken sie 2 Um den Aktuellen Stand zu sehen");
        System.out.println("Drücken sie 3 um das Spiel zu Beenden");


        while (!exit) {

            Input = scanner.nextInt();

            Random random = new Random();


            switch (Input) {

                case 1:
                    for (int i = 0; i < 7; i++) {
                        int RandomNumber1 = random.nextInt(1, 7);
                        sum1 += RandomNumber1;
                    }
                    System.out.println("Player:" + sum1);

                    for (int i = 0; i < 7; i++) {
                        int RandomNumber2 = random.nextInt(1, 7);
                        sum2 += RandomNumber2;
                    }
                    System.out.println("Computer:" + sum2);

                    if (sum1>sum2){
                        System.out.println("Winner: Player");
                }else if (sum2>sum1){
                        System.out.println("Winner: Computer");
                    };
                    break;
                case 2:

            }

        }

    }
}

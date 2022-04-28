package at.zeki.basics;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[]agrs){

        boolean exit = false;
        int input = 0;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Wählen sie eine option aus:");
        System.out.println("geben sie 1 für Einzahlen ein:");
        System.out.println("2 für Abheben:");
        System.out.println("3 für Kontostand einzusehen:");
        System.out.println("4 um es zu beenden:");
        System.out.println();

        while (!exit){


             input = scanner.nextInt();



             switch (input){
                 case 1:
                     System.out.println();
                     System.out.println("Bitte geben sie den Betrag eine:");
                     System.out.println();

                     input = scanner.nextInt();

                     balance += input;
                     System.out.println();
                     if (input == 1)
                         System.out.println("Es wurde " +input+ " Euro eingezahlt:");
                     else
                         System.out.println("Es wurden " +input+ " Euro eingezahlt:");
                     System.out.println();
                     break;
                 case 2:
                     System.out.println();
                     System.out.println("Bitte geben sie den Betrag eine:");
                     System.out.println();

                     input = scanner.nextInt();

                     balance -= input;
                     System.out.println();
                     if (input == 2)
                         System.out.println("Es wurde " +input+ " Euro abgehoben");
                     else
                         System.out.println("Es wurden " +input+ " Euro abgehoben");
                     System.out.println();
                     break;
                 case 3:
                     if (input == 3){
                         System.out.println("Der kontostand beträgt: " +balance);
                     }
                     break;
                 case 4:
                     if (input == 4) {
                         System.out.println("beendet");
                     }

                     break;
             }
        }
    }

    }


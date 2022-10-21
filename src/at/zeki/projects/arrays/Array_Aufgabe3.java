package at.zeki.projects.arrays;

import java.util.Arrays;

public class Array_Aufgabe3 {
    public static void main(String[] args) {

        /*
        Sortiere ein Array mit Zahlen nach deren Wert.
        Eingabe: [8, 3, 2, 22, 8, 1]Ausgabe: [1, 2, 3, 8, 8, 22]
        Tip: Suche im Array die kleinste Zahl. In einem zweiten Array fügst du die Zahl dann ganz vorne ein...etc.
        Hinweis - es gibt unzählige Möglichkeiten Daten zu sortieren -
        vielleicht kannst Du die Sortierung noch auf eine andere Art durchführen.
         */

        int[] num = {8, 3, 2, 22, 8, 1};

        /*code testing "things" from here to-----------------
        long timeAtStart = System.nanoTime();
        Random random = new Random();
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(0,1000);
            //System.out.println(num[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        ---------------------------------------------- here*/

        boolean[] toSort = new boolean[num.length];
        Arrays.fill(toSort, true);
        toSort[toSort.length - 1] = false;

        int temp = 0;

        boolean sorted = false;

        while(!sorted){

            for (int i = 0; i < num.length; i++) {

                if(toSort[i]) {
                    if (num[i] > num[i + 1]) {
                        temp = num[i];
                        num[i] = num[i + 1];
                        num[i + 1] = temp;
                        if(i != 0)
                            toSort[i - 1] = true;
                        else
                            toSort[i] = true;
                    } else {
                        toSort[i] = false;
                    }
                }

            }

            if (allFalse(toSort))
                sorted = true;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


        /*long deltaTime = System.nanoTime() - timeAtStart;
        System.out.println(deltaTime);      some code to check the time it took to execute the program*/


    }

    public static boolean allFalse(boolean[] toSort){
        for (int i = 0; i < toSort.length; i++){
            if (toSort[i]) return false;
        }
        return  true;
    }
}

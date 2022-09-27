package at.zeki.basics_1;

import java.util.Random;

public class Test2<isFinished> {
    public static void main(String[]args){
    Random random = new Random();
    boolean isFinished = false;
    int Ergebniss = 0;

        while (!isFinished){
        int randomValue = random.nextInt(0,10);
        System.out.println("Nr:" + randomValue);

        if((randomValue==5)){
            isFinished=true;
        }else{
            Ergebniss +=randomValue;
        }

    }
        System.out.println(Ergebniss);
}


}



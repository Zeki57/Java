package at.zeki.projects;

public class Quersumme2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            int num3 = i;
            int checkSum = 0;
            while (num3>0){
                checkSum += num3%10;
                num3 /= 10;
            }
            if (checkSum%7==0)
                System.out.println("summe: " + checkSum);
        }
    }
}
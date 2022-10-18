package at.zeki.basics;


import java.util.Random;

public class Worterraten {
    public static void main(String[] args) {
            String[] wordsToGuess = {"apple", "car", "domino", "bench"};
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToGuess.length);

       String guessingWord = wordsToGuess[randomNumber];
       guessingWord.toCharArray();
    }

    }

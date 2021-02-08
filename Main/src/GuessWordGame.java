/*Could use recursion method!!! See instructor's example of HW*/

import java.util.Scanner;
import java.util.Random;

public class GuessWordGame {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main (String[] args){
        do{
            guessWords();
            System.out.println("Play again? Yes - 1, No - 0");
        } while ((scanner.nextInt() == 1));
        System.out.println("Good-bye!");
    }

    static void guessWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess;
        String word = words[random.nextInt(words.length)];
        do {
            System.out.print("Guess the word: ");
            guess = scanner.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < guess.length() && word.charAt(i) == guess.charAt(i))
                    System.out.print(word.charAt(i));
                else
                    System.out.print((word.equals(guess))? "" : "#");
            System.out.println();
        } while (!word.equals(guess));
    }

}

import java.util.*;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void  main (String[] args) {
        do {
            playGame();
            System.out.println("Would you like to play again? 1 - yes, 0 - no");
        }
        while (scanner.nextInt() == 1);
        System.out.println(resultMessage("are junker","good-bye!"));

    }

    static void playGame(){
        for (int i = 0;i < 3;i++) {
            int randnum = Randomizer();
            System.out.println("Guess your number from 0 to 9:");
            int guessnum = inputNum();
            if (guessnum == randnum){
                System.out.println(resultMessage("WON","number is: ") + guessnum);
                break;
            } else System.out.println(resultMessage("LOST","incorrect"));

        }
    }

    static String resultMessage(String message1, String message2){
        String tmp = "You %s, %s";
        return String.format(tmp,message1,message2);
    }

    static int Randomizer(){
        Random random = new Random();
        return random.nextInt(10);
    }
    static int inputNum(){
        return scanner.nextInt();
    }
}

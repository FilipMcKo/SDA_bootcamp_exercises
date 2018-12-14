package Zad1;

import java.util.Scanner;

public class RockPaperScissors {

    enum RoPaSc{
    ROCK,PAPER,SCISSORS;
}

    public static void whoWon(String user1, String user2){
        if((user1.equals(RoPaSc.PAPER.toString())&&user2.equals(RoPaSc.ROCK.toString()))
                ||(user1.equals(RoPaSc.ROCK.toString())&&user2.equals(RoPaSc.SCISSORS.toString()))
                ||(user1.equals(RoPaSc.SCISSORS.toString())&&user2.equals(RoPaSc.PAPER.toString())))
        System.out.println("User1 is the winner!");
        else if((user2.equals(RoPaSc.PAPER.toString())&&user1.equals(RoPaSc.ROCK.toString()))
                ||(user2.equals(RoPaSc.ROCK.toString())&&user1.equals(RoPaSc.SCISSORS.toString()))
                ||(user2.equals(RoPaSc.SCISSORS.toString())&&user1.equals(RoPaSc.PAPER.toString())))
        System.out.println("User2 is the winner!");

        else
            System.out.println("It's a tie");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("User 1 type ROCK, PAPER or SCISSORS: ");
        String user1 = scanner.nextLine();
        System.out.println("User 2 type ROCK, PAPER or SCISSORS: ");
        String user2 = scanner.nextLine();

        whoWon(user1, user2);

    }
}












import java.util.*;
public class Number_Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain)
        {
            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("----------------GUESS THE NUMBER (1-100)---------------");

            while (attempts < maxAttempts && !guessed)
            {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number)
                {
                    System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                }
                else if(guess > number)
                {
                    if(Math.abs(guess-number) <= 5)
                    {
                        System.out.println("You're almost close!!");
                    }
                    else
                    {
                        System.out.println("Your guess is too HIGH!");
                    }
                }
                else if(guess < number)
                {
                    if(Math.abs(guess-number) <=5)
                    {
                        System.out.println("You're almost close!!");
                    }
                    else
                    {
                        System.out.println("Your guess is too LOW!");
                    }
                }

            }

            if (!guessed)
            {
                System.out.println("------------------GAME OVER------------------");
                System.out.println("You failed :(! The number was: " + number);
            }

            System.out.print("Do you want to play AGAIN? (yes/no): ");
            String choice = sc.next().toLowerCase();
            playAgain = choice.equals("yes");
        }

        System.out.println("Game over! Your score: " + score);
    }
}

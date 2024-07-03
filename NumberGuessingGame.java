import java.util.Random;
import java.util.Scanner;

class NumbertGuessingGame
{
    public static int score = 0;
    public static void start(int score)
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int num = rand.nextInt(99)+1;
        int guess;
        boolean flag = true;
        System.out.println("Guess the number in 4 chances \n Note: The number is below 100");
        for(int i=1;i<6;i++)
        {
            System.out.println("Guess: ");
            guess = input.nextInt();
            if(guess==num)
            {
                flag=false;
                score+=1;
                System.out.println("Congrats You Guerssed the Number Correct \n Score: "+score);
                break;
            }
            else
            {
                if(guess<num)
                {System.out.println("Too Low");}
                else
                {System.out.println("Too High");}
            }
        }
        if(flag)
        {
            System.out.println("Oops! You ran out of Chances");
            System.out.println("Score: "+score);
            System.out.println("The correct Number is: "+num);
        }
        System.out.println("Enter y to Play Again: ");
        char res = input.next().charAt(0);
        if(res=='y' || res=='Y')
        {
            start(score);
        }
        else
        {
            System.out.println("Thanks for Playing!");
        }
    }
    public static void main(String[] args)
    {
        start(score);
    }
}
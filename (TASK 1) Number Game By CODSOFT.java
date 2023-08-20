import java.util.Scanner;

public class NumberGame 
{
    private static Scanner sc;
    
    // MAIN METHOD
    public static void main(String[] args) 
    {
        sc = new Scanner(System.in);
        char choice;
        int score=0;
        System.out.println("\nOUR RULES");
        System.out.println("\nHey player I am already chosen a random no between 0-10");
        System.out.println("can you guess what is that number ,to increase your score you have only 4 attempts ");
        System.out.println("YOUR INITIAL SCORE IS 0\n");
        do
        { 
            int x = Random(0,10);
            score=game(x,score);
            System.out.println("\nPRESS 'y' FOR CONTINUE THE GAME TO INCREASE YOUR SCORE ELSE PRESS ANY KEY FOR EXIT");
            choice= sc.next().charAt(0);
        }
            while(choice=='y'|| choice=='Y');
            sc.close();
    } 

    //  METHOD FOR GENERATING THE RANDOM NUMBER 
    static int Random(int min , int max)  
    {   int x=(int)(Math.random()*(max-min))+min;
        return x;
    }
    
    //METHOD FOR GAME
    static int game (int x,int score)               
    {   
        System.out.println("GUESS THAT NUMBER...");
        int count=4;
        while(count>0)
        {   
            int UserInput=sc.nextInt();
            if(UserInput==x)
            {   System.out.println("CONGRATULATION ! YOU HAVE CHOSEN RIGHT NUMBER");
                score=score+100;
                System.out.println("YOUR SCORE IS "+score);
                return score;
            }
            else if (UserInput>x)
            {   System.out.println("you have chosen too high");
            }
            else if(UserInput<x)
            {   System.out.println("you have chosen too low ");
            }
            count--;
                System.out.println("your remaining attemped is " + count);
            if(count==0)
            {
                System.out.println(" \nYOU HAVE NO MORE ATTEMPTS IN REMAINING");
                System.out.println("\nYOUR SCORE IS STILL "+score);
            }
        }
            System.out.println("\nGAME OVER\n");
            return score;
    }  
}

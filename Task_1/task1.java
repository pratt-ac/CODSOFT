import java.util.Scanner;
import java.util.Random;

public class task1
{
public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);


    int randNum = rand.nextInt(100);
    while(true)
    {
    System.out.println("Enter your guess between 1 to 100:");

    int guessNum = scanner.nextInt();

    if(guessNum == randNum)
    {
        System.out.println("Yay that's correct!");
        break;
    }

    else if(randNum> guessNum){
    
    System.out.println("Oops !Number is higher, try again");}

    else{
        System.out.println("Oops! Number is lower try again");
    }
    }
 

}

}


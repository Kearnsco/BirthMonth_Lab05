import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int birthMonth = 0;
        Scanner console = new Scanner(System.in);
        String trash = "";

        System.out.println("Enter your birth month [1-12]: ");
        if(console.hasNextInt())
        {
            birthMonth = console.nextInt();
            console.nextLine(); // clears buffer
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your birth month is " + birthMonth);
            }
            else
            {
                System.out.println("Not sure what month " + birthMonth + " is, run the code again");
            }
        }
        else
        {
            trash = console.nextLine();
            System.out.println("You said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid month [1-12].");

        }
    }
}
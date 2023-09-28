import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("Please enter your birth month [1-12]: ");
        birthMonth = in.nextInt();
        if(birthMonth>=1 && birthMonth<=12)
            System.out.print("Your birth month is: " + birthMonth);
        else
            System.out.print("You entered and invalid birth month: " + birthMonth);
    }
}

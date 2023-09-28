import java.util.Objects;
import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String party = "";

        System.out.print("Please enter your party affiliation [D R I]: ");
        party = in.nextLine();

        if(Objects.equals(party, "D"))
            System.out.print("You get a Democratic Donkey!");
        else if(Objects.equals(party, "R"))
            System.out.print("You get a Republican Elephant!");
        else if(Objects.equals(party, "I"))
            System.out.print("You get an Independent Man!");
        else
            System.out.print("You are another party!");

    }
}

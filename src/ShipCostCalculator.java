import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;

        System.out.print("Please enter the price of your item: ");
        itemPrice =in.nextDouble();
        shippingCost = itemPrice * 0.02;

        if(itemPrice>=100)
        {
            System.out.println("Congrats you get free shipping!");
        }
        else
        {
            System.out.println("Your shipping cost based on your item price is " + shippingCost);
        }
    }
}

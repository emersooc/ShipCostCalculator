import java.util.Scanner;

public class ShipCalculator
{
    public static void main(String[] args)
    {
        //defining variables
        double shipping;
        double total;

        Scanner userInput = new Scanner(System.in); //creates scanner object
        System.out.println("Enter the price of the item: ");
        double userCost = userInput.nextDouble(); //reads user input

        if (userCost >= 100) //determines if > $100
        {
            shipping = 0.00;
        }
        else
        {
            shipping = userCost * 0.02;
        }

        total = userCost + shipping; //calculates total cost

        System.out.printf("The cost of shipping is $%.2f %n",shipping);
        System.out.printf("The total cost is $%.2f",total);
    }
}
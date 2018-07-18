import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        String itemOneName;
        out.print("Item 1? ");
        itemOneName = keyboard.nextLine();
        String itemTwoName;
        out.print("Item 2? ");
        itemTwoName = keyboard.nextLine();
        String itemThreeName;
        out.print("Item 3? ");
        itemThreeName = keyboard.nextLine();
        out.println("Now, please enter the quantity of each item.");
        int itemOneQty;
        out.print("How many " + itemOneName + "? ");
        itemOneQty = keyboard.nextInt();
        int itemTwoQty;
        out.print("How many " + itemTwoName + "? ");
        itemTwoQty = keyboard.nextInt();
        int itemThreeQty;
        out.print("How many " + itemThreeName + "? ");
        itemThreeQty = keyboard.nextInt();
        out.println("Now, please enter the price of each item.");
        float itemOneCost;
        out.print("How much does one " + itemOneName + " cost? ");
        itemOneCost = keyboard.nextFloat();
        float itemTwoCost;
        out.print("How much does one " + itemTwoName + " cost? ");
        itemTwoCost = keyboard.nextFloat();
        float itemThreeCost;
        out.print("How much does one " + itemThreeName + " cost? ");
        itemThreeCost = keyboard.nextFloat();
        out.println("Calculating your grocery bill.");
        float total;
        total = (itemOneQty * itemOneCost) + (itemTwoQty * itemTwoCost) + (itemThreeQty * itemThreeCost);
        out.println("Your total grocery bill is " + total + ".");



    }
}


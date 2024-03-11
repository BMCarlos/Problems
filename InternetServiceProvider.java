import java.util.*;

public class InternetServiceProvider
{
    public static void main(String[] args)
    {
        String userInput;
        double packageA = 9.95;
         double packageB = 13.95;
         double  packageC = 19.95;

        char packageChosen;
        double totalHours, totalSavingsAtoB, totalSavingsAtoC, totalSavingsBtoC;
/*THE ERROR MESSAGE OCCURS IN  THIS LINE FOR THE FIRST packageA AND FOR packageB*/

        totalSavingsAtoB = (packageA - 13.95);
        totalSavingsAtoC = (packageA - 19.95);
        totalSavingsBtoC = (packageB - 19.95);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which package have you obtain? (Please use A, B, or C)");
        userInput = keyboard.nextLine();
        packageChosen = userInput.charAt(0);


        switch (packageChosen)
        {

            case 'A':
                System.out.println("What are the total amount of hours used for this month?");
                totalHours = keyboard.nextDouble();
                    if (totalHours <= 10)
                    {
                     packageA = 9.95 * totalHours;
                     System.out.print("For Package A:\nThe total charges for this month is $ " + packageA);
                     System.out.print("\nYou save a total of " + totalSavingsAtoB + "if you chose Package B\n"
                                     + "and you would have save a total of " + totalSavingsAtoC + "if you chose Package C.");
                    }
                    else

                      packageA = 9.95 + (totalHours * 2.00);
                      System.out.print("For Package A:\nThe total charges for this month is $ " + packageA);

                    if (totalSavingsAtoB > packageA)
                    {
                        totalSavingsAtoB = (packageA - 13.95);
                        totalSavingsAtoC = (packageA - 19.95);
                        System.out.print("\nYou save a total of " + totalSavingsAtoB + "if you chose Package B\n"
                                     + "and you would have save a total of " + totalSavingsAtoC + "if you chose Package C.");

                    }
                    break;
            case 'B':
                System.out.println("What are the total amount of hours used for this month?");
                totalHours = keyboard.nextDouble();
                if (totalHours <= 20)
                {
                    packageB = 13.95 * totalHours;
                    System.out.print("For Package B:\nThe total charges for this month is $" + packageB);
                    System.out.print("You would have save a total of " + totalSavingsBtoC + ", if you have chosen Package C.");
                }
                else
                {
                    packageB = 13.95 + (totalHours * 1.00);
                    System.out.print("For Package B:\nThe total charges for this month is $" + packageB);
                    System.out.print("You would have save a total of " + totalSavingsBtoC + ", if you have chosen Package C.");
                }
                if (totalSavingsAtoB > packageA)
                {
                    totalSavingsBtoC = (packageB - 19.95);
                    System.out.print("\nYou save a total of " + totalSavingsAtoB + "if you chose Package B\n"
                                     + "and you would have save a total of " + totalSavingsAtoC + "if you chose Package C.");

                }
                break;
            case 'C':
                System.out.print("For Package C:\nThe total charge for this is $19.95.");
                System.out.print(" \nThank you for using our service!  " );
                     break;
            default:
                    System.out.print("Invalid entry, Please try again.");
       }

    }
}
/* Program calculates a customer's monthly bill. It asks the user to enter the letter of the package the customer purchased
along with the number of  hours that were used.

Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.

Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.

Package C: For $19.95 per month unlimited access is provided.

Display a prompt that instructs the user to enter the package purchased and the hours used

Determine if the hours used qualify for a surcharge

If the hours used qualify for a

surchage then compute the bill accordingly

Compute the monthly bill using the user selected package and any surcharge

Display the monthly bill which includes the package and surcharge
*/
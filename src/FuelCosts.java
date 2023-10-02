import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double gallonsTank = 0;
        double carMPG = 0;
        double pricePerGallon = 0;

        do
        {
            System.out.print("Enter the number of gallons that is in the car: ");
            gallonsTank = scanner.nextDouble();
        } while (gallonsTank <= 0);

        do
        {
            System.out.print("Enter your car's miles per gallon: ");
            carMPG = scanner.nextDouble();
        } while (carMPG <= 0);

        do
        {
            System.out.print("Enter your price per gallon: $");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        double costPer100 = (100 / carMPG) * pricePerGallon;
        System.out.println("Your cost per 100 miles is $" + costPer100);

        double distance = gallonsTank * carMPG;
        System.out.println("Your car can go " + distance + " miles.");
    }
}
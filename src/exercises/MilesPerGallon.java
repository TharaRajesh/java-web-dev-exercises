package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles travelled : ");
        double miles = scan.nextDouble();
        System.out.println("Enter gallons : ");
        double gallons = scan.nextDouble();
        //  mpg = miles/gallon;
        double mpg = miles/gallons;
        System.out.println("Miles Per Gallon is:"+ mpg);
    }
}

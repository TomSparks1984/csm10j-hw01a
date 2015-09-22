import java.util.Scanner;
import java.io.FileReader;

public class Hw01a {
    static String ticker1;
    static double price1;
    static String ticker2;
    static double price2;
    
    public static void main(String[] args) throws java.io.FileNotFoundException {
        System.out.println("Enter '1' to get price by stock ticker");
        System.out.println("Enter '2' to get stocks greater than or equal to specified price");
        System.out.println("Enter '3' to quit");
        System.out.printf("Your choice: ");
        
        Scanner file = new Scanner(new FileReader("stocks.txt"));
        Scanner console = new Scanner(System.in);

        int choice = console.nextInt();
        ticker1 = file.next();
        price1 = file.nextDouble();
        ticker2 = file.next(); 
        price2 = file.nextDouble();
        
        if(choice > 3){
            System.out.println("Unrecognized menu option, exiting");
        }
        if(choice < 1){
            System.out.println("Unrecognized menu option, exiting");
        }
            switch (choice){
            case 1: 
                String userTicker;
                System.out.println("your choice: " + choice);
                System.out.printf("Enter a stock ticker: ");
                userTicker = console.next();
                choice1(userTicker);
            break;
            case 2:
                double userPrice;
                System.out.println("your choice: " + choice);
                System.out.printf("Enter a price: ");
                userPrice = console.nextDouble();
                choice2(userPrice);
            break;
            case 3:
                System.out.println("Goodbye");
            break;
            }
    }
    public static void choice1(String userTicker){
        userTicker = userTicker.toUpperCase();
        if (userTicker.equals(ticker1)){
            System.out.println(ticker1 + " current price is " + String.format("%.2f", price1));
        }
        else if (userTicker.equals(ticker2)) {
            System.out.println(ticker2 + " current price is " + String.format("%.2f", price2));
        }
    }
    public static void choice2(double userPrice){
        if (userPrice <= (price1)){
            System.out.println(ticker1 + " is more than or equal to " + String.format("%.2f", userPrice));
        }
        if (userPrice <= (price2)) {
            System.out.println(ticker2 + " is more than or equal to " + String.format("%.2f", userPrice));
        }
    }
    
}

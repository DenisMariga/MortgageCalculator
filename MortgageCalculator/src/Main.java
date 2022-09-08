import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte month=12;
        final byte percentage = 100;
        int principle =0;
        float interest=0;
        float years=0;
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.print("Enter Principle ($1K-$1M): ");
        principle =scanner.nextInt();
        if (principle >=1000 && principle <= 1000_000){
            break;
        }else {

            System.out.print("Enter a value between 1,000 and 1000,000");
        }
        }
        while (true){
        System.out.print("Enter Annual Interest Rate: ");
        interest = (scanner.nextFloat()/percentage)/month;
        if (interest > 0 && interest <=30){
            break;
        }else {
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        }
        while (true){
        System.out.print("Period in Years: ");
         years = scanner.nextFloat()*month;
         if (years >=1 && years <=30)
             break;
            System.out.println("Enter a value between 1 and 30");
        }
        float mortgage = (float) (principle*(interest* Math.pow(1+interest,years)/(Math.pow(1+interest,years)-1)));
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
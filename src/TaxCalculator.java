import java.util.Scanner;

//Write a program that calculates the income tax for a person based on their income and tax brackets. Assume the following tax brackets:
//Income up to $10,000: 5% tax
//Income from $10,001 to $20,000: 10% tax
//Income above $20,000: 15% tax
public class TaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the income:");
        double incomeAmount = sc.nextDouble();

        double taxAmount;

        if(incomeAmount <= 10000){
            taxAmount = incomeAmount * 0.05;
        } else if (incomeAmount <= 20000) {
            taxAmount = 500 + (incomeAmount - 10000) * 0.10;
        } else{
            taxAmount = 1500 + (incomeAmount - 20000) * 0.15;
        }
        System.out.println("The income tax amount is:"+taxAmount);
    }
}

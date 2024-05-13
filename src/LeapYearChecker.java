import java.util.Scanner;

//Write a program that determines whether a given year is a leap year or not.
// A leap year is divisible by 4 but not by 100 unless it is divisible by 400.
public class LeapYearChecker {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeapYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapYear = true;
        }else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println("Is a leap year");
        }else {
            System.out.println("Is not a leap year");
        }
    }

}

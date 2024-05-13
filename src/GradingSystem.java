//Write a program that takes a student's score as input and outputs their corresponding grade based on the following criteria:
//
//        90 and above: A
//        80-89: B
//        70-79: C
//        60-69: D
//        Below 60: F
import java.util.Scanner;

public class GradingSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = sc.nextInt();

        char grade;

        if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("Grade is:"+grade);

    }
}

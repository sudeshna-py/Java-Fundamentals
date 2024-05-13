import java.util.Scanner;

//Write a program that takes a character (a-z or A-Z) as input and determines whether it is a vowel or a consonant.
public class VowelConstChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character from a-z or A-Z:");
        char ch = sc.next().charAt(0);

        // checking for letter
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'O' || ch == 'O' || ch == 'U'){
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println("Invalid, Enter a valid character");
        }


    }
}

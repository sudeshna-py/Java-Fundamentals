import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter operation (+, -, *, /, %):");
        String operation = sc.next();

        int answer = 0;

        switch (operation){
            case "+":
                answer = a + b;
                System.out.println("Addition = "+ answer);
                break;
            case "-":
                answer = a - b;
                System.out.println("Subtraction = "+ answer);
                break;
            case "*":
                answer = a * b;
                System.out.println("Multiplication = "+ answer);
                break;
            case "/":
                if (b != 0){
                    answer = a / b;
                    System.out.println("Division = "+ answer);
                } else {
                    System.out.println("cannot divide by zero");
                }
                break;
            case "%":
                answer = a % b;
                System.out.println("Remainder = "+ answer);
                break;
            default:
                System.out.println("invalid operation");


        }

    }
}

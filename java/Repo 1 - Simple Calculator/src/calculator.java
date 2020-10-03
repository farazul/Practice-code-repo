//author : Bishal Raj Majumder
//Java code for a calculator

import java.util.*;
public class calculator {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter two numbers: ");
    // nextDouble() reads the next double from the keyboard
    double first = sc.nextDouble();
    double second = sc.nextDouble();
    System.out.print("\nEnter an operator (+, -, *, /): ");
    char op = sc.next().charAt(0);
    double result;
    switch(op)
    {
        case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("\nError! operator is not correct");
                return;
        }

        System.out.printf("\n%.1f %c %.1f = %.1f", first, op, second, result);
    }
}
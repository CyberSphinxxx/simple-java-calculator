import java.util.Scanner;

public class JLGCalculator {
    public static void main(String[] args) {
        double num1 = readDouble("Enter the first number here:");
        double num2 = readDouble("Enter the second number here:");
        char operator = readOperator("Enter the operator you want to use (+, -, *, /):");
        double result = calculate(num1, num2, operator);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static double readDouble(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextDouble();
    }

    public static char readOperator(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.next().charAt(0);
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Invalid operator");
                return Double.NaN; // NaN stands for "Not a Number"
        }
    }
}

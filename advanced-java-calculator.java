import java.util.Scanner;

public class JLGCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = readDouble(scanner, "Enter the first number:");
        double num2 = readDouble(scanner, "Enter the second number:");
        char operator = readOperator(scanner, "Enter the operator (+, -, *, /):");

        if (!isValidOperator(operator)) {
            System.out.println("Invalid operator");
            return;
        }

        double result = calculate(num1, num2, operator);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }

    public static double readDouble(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public static char readOperator(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.next().charAt(0);
    }

    public static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
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
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                return Double.NaN;
        }
    }
}

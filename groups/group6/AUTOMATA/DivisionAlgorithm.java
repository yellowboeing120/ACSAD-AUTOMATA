import java.util.Scanner;

public class DivisionAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = getValidInput(scanner, "first");
        int secondNum = getValidInput(scanner, "second");

        int m, n;

        
        if (firstNum >= secondNum) {
            m = firstNum;
            n = secondNum;
        } else {
            m = secondNum;
            n = firstNum;
        }

        int q = m / n;
        int r = m % n;

        System.out.println("\nSOLUTION:");
        System.out.println(m + " = " + n + "(" + q + ") + " + r);
        System.out.println("The dividend is " + m);
        System.out.println("The divisor is " + n);
        System.out.println("The quotient is " + q + " and the remainder is " + r);

        scanner.close();
    }

    
    public static int getValidInput(Scanner scanner, String label) {
        int num;

        while (true) {
            System.out.print("Enter the " + label + " integer: ");

            
            if (!scanner.hasNextInt()) {
                System.out.println(" ERROR: Invalid input. Please enter a whole number.");
                scanner.next(); 
                continue;
            }

            num = scanner.nextInt();

            
            if (num <= 0) {
                System.out.println(" ERROR: Number must be positive and greater than zero.");
                continue;
            }

            
            break;
        }

        return num;
    }
}
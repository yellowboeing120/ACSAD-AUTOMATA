import java.io.IOException;

public class PalindromeChecker1 {
    public static void main(String[] args) throws IOException {
        char[] raw = new char[100];
        int rawLength = 0;
        boolean hasNumber;

        do {
            System.out.print("Enter a string: ");
            rawLength = 0;
            hasNumber = false;

            int ch;
            while ((ch = System.in.read()) != -1 && ch != 10 && ch != 13) { 
                raw[rawLength] = (char) ch;
                rawLength++;
            }

         
            for (int i = 0; i < rawLength; i++) {
                if (raw[i] >= 48 && raw[i] <= 57) {
                    hasNumber = true;
                    break;
                }
            }

            if (hasNumber) {
                System.out.println("Numbers are not allowed. Please try again.");
            }

        } while (hasNumber);

      
        char[] input = new char[100];
        int length = 0;
        for (int i = 0; i < rawLength; i++) {
            char c = raw[i];
            if (c >= 65 && c <= 90) { 
                c = (char)(c + 32);  
            }
            input[length] = c;
            length++;
        }

     
        System.out.print("String entered: ");
        for (int i = 0; i < length; i++) {
            System.out.print(input[i]);
        }
        System.out.println();

        
        boolean isPalindrome = true;
        int start = 0;
        int end = length - 1;
        while (start < end) {
            if (input[start] != input[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        System.out.println("Length of the string: " + length);
    }
}
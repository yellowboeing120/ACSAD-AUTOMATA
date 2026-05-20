import javax.swing.*;

public class CollatzGUI_Loop {
    public static void main(String[] args) {

        int n;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    "This program will find all the terms of the Collatz sequence.\nEnter a positive odd integer:");

            if (input == null) {
                return;
            }

                        try {
                n = Integer.parseInt(input);

                
                if (n <= 0 || n % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "INVALID OUTPUT");
                } else {
                    break; 
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INVALID OUTPUT");
            }
        }

        StringBuilder sequence = new StringBuilder();

        while (n != 1) {
            sequence.append(n).append(", ");
            if (n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
        }

        sequence.append("1");

        JOptionPane.showMessageDialog(null,
                "The Collatz sequence are:\n" + sequence.toString());
    }
}

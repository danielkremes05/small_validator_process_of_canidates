import Canidate.Candidate;

import javax.swing.*;

/**
 * Main class to demonstrate candidate salary input and selection.
 */
public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();

        for (int i = 0; i < 5; i++) {
            try {
                String nameCandidate = JOptionPane.showInputDialog("Enter the candidate's name:");
                String salaryCandidate = JOptionPane.showInputDialog("Enter the candidate's salary:");

                // Check if the user cancelled the input dialog
                if (salaryCandidate == null || nameCandidate == null) {
                    System.out.println("Salary or name is null, please try again.");
                    continue;
                }

                // Parse the salary input to a double
                double salary = Double.parseDouble(salaryCandidate);
                candidate.salaryCandidate(salary, nameCandidate);
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary format, please enter a numeric value.");
            }
        }

        // Display the selected candidates
        candidate.selected();
    }
}

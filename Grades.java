import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Integer credits = 0;
        boolean validCredits = false;
        do {
            System.out.println("Enter number of credits:");
            String creditsString = scnr.nextLine();

            try {
                credits = Integer.parseInt(creditsString);
                validCredits = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid integer: ");
            }
        } while (validCredits == false);

        System.out.println("Enter grade:");
        String grade = scnr.nextLine();

        Integer gradeVal = 0;
        if (grade.equalsIgnoreCase("A")) {
            gradeVal = 4;
        } else if (grade.equalsIgnoreCase("B")) {
            gradeVal = 3;
        } else if (grade.equalsIgnoreCase("C")) {
            gradeVal = 2;
        } else if (grade.equalsIgnoreCase("D")) {
            gradeVal = 1;
        } else if (grade.equalsIgnoreCase("F")) {
            gradeVal = 0;
        } else {
            System.out.println("You did not enter a valid grade.");
        }

        Integer points = gradeVal * credits;

        Integer gpa = points / credits;

        System.out.println("Credits: " + credits);
        System.out.println("Grade: " + grade);
        System.out.println("Points: " + points);
        System.out.println("GPA: " + gpa);

        scnr.close();
    }
}

import java.text.*;
import java.util.*;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to my GPA calculator.");
        Scanner scnr = new Scanner(System.in);
        Integer totalPoints = 0;
        Integer totalCredits = 0;

        boolean moreClasses = false;

        do {

            Integer credits = 0;
            boolean validCredits = true;
            do {
                validCredits = true;
                System.out.println("Enter number of credits:");
                String creditsString = scnr.nextLine();

                try {
                    credits = Integer.parseInt(creditsString);

                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid integer: ");
                    validCredits = false;
                }
            } while (!validCredits);

            boolean validGrade = true;
            Integer gradeVal = 0;
            String grade = "";

            do {
                validGrade = true;
                System.out.println("Enter grade:");
                grade = scnr.nextLine();

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
                    validGrade = false;
                }
            } while (!validGrade);
            Integer points = gradeVal * credits;
            totalPoints += points;
            totalCredits += credits;

            System.out.println("Would you like to enter another class? (Y/N)");
            String moreClassesString = scnr.nextLine();
            moreClasses = moreClassesString.equalsIgnoreCase("Y");

        } while (moreClasses);

        DecimalFormat df = new DecimalFormat("0.00");

        Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);

        System.out.println("Credits: " + totalCredits);
        System.out.println("Points: " + totalPoints);
        System.out.println("GPA: " + df.format(gpa));
        System.out.println("Enjoy your day! Goodluck on your educational endeavors!");
        scnr.close();
    }
}

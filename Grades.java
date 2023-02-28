import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of credits:");
        String credits = scnr.nextLine();

        System.out.println("Enter grade:");
        String grade = scnr.nextLine();

        System.out.println(credits);
        System.out.println(grade);

        scnr.close();
    }
}

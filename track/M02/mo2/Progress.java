
import java.util.Scanner;

public class Progress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter learner name: ");
        String learner = scan.nextLine();
        System.out.println(learner);
        System.out.println("Enter number of practice days: ");
        int practiceDays = scan.nextInt();
        System.out.println(practiceDays);
        int solvedProblemCount = 0;
        System.out.println("Enter solved problem count: ");
        int solvedProblemCount1 = scan.nextInt();
        System.out.println(solvedProblemCount);
        for (int i = 1; i <= practiceDays; i++) {
            solvedProblemCount += solvedProblemCount1;
        }
        double average = solvedProblemCount / practiceDays;
        System.out.println("Learner: " + learner);
        System.out.println("Total Solved: " + solvedProblemCount);
        System.out.println("Daily Average: " + average);
        String res = (average >= 5) ? "Consistency" : "Needs Consistency";
        System.out.println("Status: " + res);
    }
}

import java.util.Scanner;

class izzaraProblem {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double quiz1, quiz2, test1, test2;

        log("Please input the mark for each criterions:");

        log("\nQuiz 1: ");
        quiz1 = sc.nextDouble();
        log("Quiz 2: ");
        quiz2 = sc.nextDouble();
        log("Test 1: ");
        test1 = sc.nextDouble();
        log("Test 2: ");
        test2 = sc.nextDouble();

        double finalMark = (quiz1 + quiz2) / 2 + test1 + test2;

        log("\nStudent's final mark is " + finalMark);

        sc.close();
    }

    static void log (String message) {
        System.out.print(message);
    }
}

import java.util.Scanner;

class factoryWorkerSalary {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalWorkingHour;

        log("What is your total working hours?\n");
        totalWorkingHour = sc.nextDouble();

        double netSalary = 5.5 * totalWorkingHour * 0.9;

        log("Your net salary for this month is RM" + netSalary);

        sc.close();
    }

    static void log (String message) {
        System.out.print(message);
    }
}

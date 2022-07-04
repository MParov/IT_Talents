import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert day: ");
        int day = scanner.nextInt();
        System.out.print("Please insert month: ");
        int month = scanner.nextInt();
        System.out.print("Please insert year: ");
        int year = scanner.nextInt();

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid day of month!");
        } else {
            if (day == 31) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                    day = 1;
                    month += 1;
                } else if (month == 12) {
                    day = 1;
                    month = 1;
                    year += 1;
                }
            } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                day = 1;
                month += 1;
            } else if (month == 2) {
                if (day > 29) {
                    System.out.println("Invalid day for February!");
                } else if (year % 400 == 0 || year % 4 == 0) {
                    if (day == 29) {
                        day = 1;
                        month += 1;
                    } else if (day == 28) {
                        day += 1;
                    } else {
                        day = 1;
                        month += 1;
                    }
                } else {
                    day = 1;
                    month += 1;
                }
            } else {
                day += 1;
            }
            System.out.println(day + "," + month + "," + year);
        }
    }
}

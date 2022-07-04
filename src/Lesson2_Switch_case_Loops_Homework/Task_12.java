import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int number = i;
            boolean noEqualsDigit = true;
            int first = number % 10;
            number /= 10;
            int second = number % 10;
            number /= 10;
            int third = number;

            if (first == second || second == third || first == third) {
                noEqualsDigit = false;
            }
            if (noEqualsDigit) {
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        while (first <= 9) {
            System.out.print(first + "*" + second + "; ");
            if (second == 9) {
                System.out.println();
                second = first;
                first++;
            }
            second++;
        }
    }
}

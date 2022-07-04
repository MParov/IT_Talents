import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number; j++) {
                int value = i + j;
                if (value == number) {
                    System.out.print("0 ");
                } else {
                    if (value > number) {
                        value -= number;
                    }
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}

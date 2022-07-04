import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = {'c', 'm', 'p'};
        System.out.print("Please insert symbol: ");
        char ch = scanner.next().charAt(0);

        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}

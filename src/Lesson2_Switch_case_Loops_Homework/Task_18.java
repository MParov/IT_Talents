import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first number: ");
        int first = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int second = scanner.nextInt();

        if (first <= 9 && first >= 1 && second >= 1 && second <= 9) {
            for (int i = 1; i<=first;i++){
                for (int j = 1; j <= second; j++) {
                    int result= i*j;
                    System.out.println(i+"*"+j+"= "+result);
                }
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}

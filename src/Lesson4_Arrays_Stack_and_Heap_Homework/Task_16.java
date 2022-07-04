import java.util.Arrays;

public class Task_16 {
    public static void main(String[] args) {
        double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};

        double[] newArray = new double[array.length];

        for (int i = 1; i < array.length + 1; i++) {
            if (array[i - 1] < -0.231) {
                newArray[i - 1] = (i * i) + 41.25;
            } else {
                newArray[i - 1] = array[i - 1] * i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
//            System.out.printf("%.2f; %.2f; %.1f; %.1f; %.0f; %.1f; %.1f; %.1f; %.1f; %.0f", array[i]);
//            System.out.printf("%.2f; %.2f; %.1f; %.1f; %.0f; %.1f; %.1f; %.1f; %.1f; %.0f", newArray[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(newArray[i] + ", ");
            } else {
                System.out.print(newArray[i]);
            }
        }
    }
}

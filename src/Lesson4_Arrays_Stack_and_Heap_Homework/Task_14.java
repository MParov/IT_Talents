import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {
        double[] array = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
        double[] newArray = new double[2];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > -3 && array[i] < 3) {
                counter++;
                if (counter > newArray.length) {
                    double[] transfer = new double[newArray.length + 1];
                    for (int j = 0; j < newArray.length; j++) {
                        transfer[j] = newArray[j];
                    }
                    newArray = transfer;
                }
                newArray[counter - 1] = array[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (i != newArray.length - 1) {
                System.out.print(newArray[i] + "; ");
            } else {
                System.out.print(newArray[i]);
            }
        }
    }
}

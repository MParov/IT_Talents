public class Task_10 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int maxCounted = arr[0];
        int maxCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            int counted = arr[i];
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == counted) { // Тук някъде трябва да е оптимизацията да я видя от зачписа на лекцията
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounted = counted;
                maxCounter = counter;
            }
        }
        System.out.println("Max is " + maxCounted + " (" + maxCounter + " times).");
    }
}

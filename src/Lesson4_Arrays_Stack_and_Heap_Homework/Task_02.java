public class Task_02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
            newArray[i] = array[i];
        }
        int halfArray = array.length/2;
        for (int i = array.length / 2; i > 0; i--) {
            newArray[halfArray] = array[i-1];
            halfArray++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
public class Task_07 {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        int totalSum = 0;

        for (int row = 0; row < array.length; row++) {
            int middleSum = 0;
            for (int col = 0; col < array[row].length; col++) {
                if ((row + col) % 2 == 0) {
                    middleSum += array[row][col];
                    if (col < array[row].length - 1) { // Detail printing from example!
                        System.out.print(array[row][col] + ", ,");
                    } else if (row == array.length - 1 && col == array[row].length - 1) {
                        System.out.print(array[row][col]);
                    } else {
                        System.out.print(array[row][col] + ",");
                    }
                }
            }
            System.out.print(" sum from elements for row : " + middleSum);
            System.out.println();
            totalSum += middleSum;
        }
        System.out.println();
        System.out.println("Sum of elements: " + totalSum);
    }
}

/*
        11, ,13, ,15, , сума от елементите за реда: 39
        22, ,24, ,26, сума от елементите за реда: 72
        31, ,33, ,35, , сума от елементите за реда: 99
        42, ,44, ,46, сума от елементите за реда: 132
        51, ,53, ,55, , сума от елементите за реда: 159
        62, ,64, ,66 сума от елементите за реда: 192

        Сума на елементите: 693
        */


import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0 && number <= 51) {
            int colors = number % 4;
            int cards = number / 4;

            if (colors == 0) {
                colors = 4;
                cards -= 1;
            }

            for (int card = cards+2; card <= 14; card++) {

                for (int color = colors; color <= 4; color++) {
                    if (card <= 10) {
                        System.out.print(card + " ");
                    } else {
                        switch (card) {
                            case 11:
                                System.out.print("Jack ");
                                break;
                            case 12:
                                System.out.print("Queen ");
                                break;
                            case 13:
                                System.out.print("King ");
                                break;
                            case 14:
                                System.out.print("Ace ");
                                break;
                        }
                    }
                    switch (color) {
                        case 1:
                            System.out.print("Clubs" + ", ");
                            break;
                        case 2:
                            System.out.print("Diamonds" + ", ");
                            break;
                        case 3:
                            System.out.print("Hearts" + ", ");
                            break;
                        case 4:
                            System.out.print("Spades" + ", ");
                            break;
                    }
                }
                colors = 1;
            }
        } else {
            System.out.println("Invalid number!");
        }
    }
}

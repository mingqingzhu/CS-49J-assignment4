import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Choose the exercise:\n" +
                    "1. Exercise 1\n" +
                    "2. Exercise 2\n" +
                    "3. Exercise 3\n" +
                    "4. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Exercise_1 exercise1 = new Exercise_1();
                exercise1.displayNum();
            } else if (choice == 2) {
                System.out.println("Please enter a string: ");
                String input = scanner.next();
                Exercise_2 exercise2 = new Exercise_2(input);
                exercise2.printRev();
            } else if (choice == 3) {
                System.out.println("Please enter the number for nth-term: ");
                int n = scanner.nextInt();
                Exercise_3 exercise3 = new Exercise_3(n);
                exercise3.printFib();
            } else if (choice == 4) {
                flag = false;
            } else {
                System.out.println("Your selection is invalid!");
            }
        } while(flag);
    }
}

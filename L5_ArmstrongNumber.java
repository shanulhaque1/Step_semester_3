import java.util.Scanner;

public class L5_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int origNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(Math.abs(number)).length();

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            number = number / 10;
        }

        boolean isArmstrong = sum == origNumber;

        System.out.println(
            "Is the number " + origNumber + " an Armstrong number? " + isArmstrong
        );

        scanner.close();
    }
}

package C4;

public class NestedIf {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println(number + " is a positive number.");

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        } else {
            System.out.println(number + " is not a positive number.");
        }
    }
}
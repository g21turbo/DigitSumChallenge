public class Main {
    public static void main(String[] args) {


        System.out.println("The sum of the digits in 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in 1111111 is " + sumDigits(1111111));

    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        } else {
            int sum = 0;

            while(number > 9) {
                sum += (number % 10);
                number = number / 10;
            }
            sum += number;
            return sum;
        }
    }
}
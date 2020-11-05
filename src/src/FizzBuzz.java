public class FizzBuzz {

    static String fizzbuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        System.out.println(fizzbuzz(5));
    }
}
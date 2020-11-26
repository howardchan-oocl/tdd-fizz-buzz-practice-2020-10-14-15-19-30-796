package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final int MODULE_3 = 3;
    public static final String BUZZ = "Buzz";
    public static final int MODULE_5 = 5;
    public static final String WHIZZ = "Whizz";
    public static final int MODULE_7 = 7;

    public String countOff(int order) {
        if (order % MODULE_3 == 0 && order % MODULE_5 == 0) {
            return FIZZ + BUZZ;
        } else if (order % MODULE_3 == 0 && order % MODULE_7 == 0) {
            return FIZZ + WHIZZ;
        } else if (order % MODULE_5 == 0 && order % MODULE_7 == 0) {
            return BUZZ + WHIZZ;
        } else if (order % MODULE_3 == 0) {
            return FIZZ;
        } else if (order % MODULE_5 == 0) {
            return BUZZ;
        } else if (order % MODULE_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}

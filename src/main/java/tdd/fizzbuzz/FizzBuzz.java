package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final int MODULE_3 = 3;
    public static final String BUZZ = "Buzz";
    public static final int MODULE_5 = 5;

    public String countOff(int order) {
        if (order % MODULE_3 == 0) {
            return FIZZ;
        }else if (order % MODULE_5 == 0) {
            return BUZZ;
        }
        return String.valueOf(order);
    }
}

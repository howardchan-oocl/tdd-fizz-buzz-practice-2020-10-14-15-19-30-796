package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final int MODULE_3 = 3;

    public String countOff(int order) {
        if (order % MODULE_3 == 0) {
            return FIZZ;
        }
        return String.valueOf(order);
    }
}

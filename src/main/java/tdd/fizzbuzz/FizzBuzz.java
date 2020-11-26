package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final int MODULO_3 = 3;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_5 = 5;
    private static final String WHIZZ = "Whizz";
    private static final int MODULO_7 = 7;

    public String countOff(int order) {
        if (order % MODULO_3 == 0 && order % MODULO_5 == 0 && order % MODULO_7 == 0) {
            return FIZZ + BUZZ + WHIZZ;
        } else if (order % MODULO_3 == 0 && order % MODULO_5 == 0) {
            return FIZZ + BUZZ;
        } else if (order % MODULO_3 == 0 && order % MODULO_7 == 0) {
            return FIZZ + WHIZZ;
        } else if (order % MODULO_5 == 0 && order % MODULO_7 == 0) {
            return BUZZ + WHIZZ;
        } else if (order % MODULO_3 == 0) {
            return FIZZ;
        } else if (order % MODULO_5 == 0) {
            return BUZZ;
        } else if (order % MODULO_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }
}

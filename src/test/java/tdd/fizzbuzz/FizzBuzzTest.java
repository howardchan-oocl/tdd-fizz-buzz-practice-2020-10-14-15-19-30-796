package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_order_number_when_input_normal_order_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 1;

        assertEquals("1", fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_Fizz_when_input_is_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 3;

        assertEquals("Fizz", fizzBuzz.countOff(order));
    }
}

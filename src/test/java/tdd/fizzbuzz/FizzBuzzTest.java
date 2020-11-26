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

    @Test
    public void should_return_Buzz_when_input_is_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 5;

        assertEquals("Buzz", fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_Whizz_when_input_is_multiple_of_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 7;

        assertEquals("Whizz", fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_multiple_of_3and5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 15;

        assertEquals("FizzBuzz", fizzBuzz.countOff(order));
    }

    @Test
    public void should_return_FizzWhizz_when_input_is_multiple_of_3and7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int order = 21;

        assertEquals("FizzWhizz", fizzBuzz.countOff(order));
    }
}

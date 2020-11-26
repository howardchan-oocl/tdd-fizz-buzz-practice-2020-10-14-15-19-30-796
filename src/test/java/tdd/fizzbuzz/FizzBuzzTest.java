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
}

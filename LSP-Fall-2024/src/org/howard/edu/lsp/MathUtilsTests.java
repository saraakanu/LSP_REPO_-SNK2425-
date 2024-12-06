package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the MathUtils class, covering factorial, isPrime, and GCD methods.
 */
public class MathUtilsTests {

    /**
     * Tests factorial(0) to ensure it returns 1.
     */
    @Test
    public void testFactorial_withZeroInput() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.factorial(0);
        assertEquals(1, result, "factorial(0) should return 1");
    }

    /**
     * Tests factorial(1) to ensure it returns 1.
     */
    @Test
    public void testFactorial_withOneInput() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.factorial(1);
        assertEquals(1, result, "factorial(1) should return 1");
    }

    /**
     * Tests factorial with a positive integer.
     */
    @Test
    public void testFactorial_withPositiveInput() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.factorial(5);
        assertEquals(120, result, "factorial(5) should return 120");
    }

    /**
     * Tests factorial with a larger integer
     */
    @Test
    public void testFactorial_withLargeInput() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.factorial(10);
        assertEquals(3628800, result, "factorial(10) should return 3,628,800");
    }

    /**
     * Tests factorial with a negative number to ensure an exception is thrown.
     */
    @Test
    public void testFactorial_withNegativeInput_throwsException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        }, "factorial(-1) should throw IllegalArgumentException");
    }

    /**
     * Tests isPrime with a prime number.
     */
    @Test
    public void testIsPrime_withPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(7), "7 should be prime");
    }

    /**
     * Tests isPrime with a non-prime number.
     */
    @Test
    public void testIsPrime_withNonPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(10), "10 should not be prime");
    }

    /**
     * Tests isPrime with 1 and 0 to ensure they are not prime.
     */
    @Test
    public void testIsPrime_withOneAndZero() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(1), "1 should not be prime");
        assertFalse(mathUtils.isPrime(0), "0 should not be prime");
    }

    /**
     * Tests isPrime with a negative number.
     */
    @Test
    public void testIsPrime_withNegativeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(-5), "Negative numbers should not be prime");
    }

    /**
     * Tests isPrime with 2, the smallest prime number.
     */
    @Test
    public void testIsPrime_withSmallestPrime() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(2), "2 should be prime");
    }

    /**
     * Tests GCD with two non-zero numbers.
     */
    @Test
    public void testGcd_withTwoNonZeroInputs() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.gcd(54, 24);
        assertEquals(6, result, "gcd(54, 24) should return 6");
    }

    /**
     * Tests GCD with one input as zero.
     */
    @Test
    public void testGcd_withOneZeroInput() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.gcd(0, 15);
        assertEquals(15, result, "gcd(0, 15) should return 15");

        result = mathUtils.gcd(-20, 0);
        assertEquals(20, result, "gcd(-20, 0) should return 20");
    }

    /**
     * Tests GCD with both inputs as zero to ensure an exception is thrown.
     */
    @Test
    public void testGcd_withBothZero_throwsException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        }, "gcd(0, 0) should throw IllegalArgumentException");
    }

    /**
     * Tests GCD with negative inputs.
     */
    @Test
    public void testGcd_withNegativeInputs() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.gcd(-8, -12);
        assertEquals(4, result, "gcd(-8, -12) should return 4");
    }

    /**
     * Tests GCD with co-prime numbers.
     */
    @Test
    public void testGcd_withCoprimeNumbers() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.gcd(17, 13);
        assertEquals(1, result, "gcd(17, 13) should return 1");
    }
}


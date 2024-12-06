package org.howard.edu.lsp.finalexam.question2;
import java.util.Random;

public class BuiltInRandomNumberGenerator {
	private Random random;

    /**
     * Constructs a RandNumberGenBuiltIn instance.
     */
    public BuiltInRandomNumberGenerator() {
        this.random = new Random();
    }

    /**
     * Generates a positive random number.
     * 
     * @return a positive pseudo-randomly generated integer value.
     */
    public int generateRandomNumber() {
        // Use nextInt() with Integer.MAX_VALUE to ensure the result is positive
        return random.nextInt(Integer.MAX_VALUE);
    }
}

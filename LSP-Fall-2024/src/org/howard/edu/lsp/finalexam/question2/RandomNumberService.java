package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
    private static final RandomNumberService instance = new RandomNumberService();
    private Object generator;

    /**
     * Private constructor to enforce the Singleton pattern.
     */
    private RandomNumberService() {}

    /**
     * @return the singleton instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        return instance;
    }

    /**
     * @param generator an object representing the generator strategy 
     */
    public void setGenerator(Object generator) {
        this.generator = generator;
    }

    /**
     * @return a randomly generated integer.
     * @throws IllegalStateException if the generator is not set.
     */
    public int getRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("Generator not set.");
        }
        if (generator instanceof BuiltInRandomNumberGenerator) {
            return ((BuiltInRandomNumberGenerator) generator).generateRandomNumber();
        } else if (generator instanceof RandNumberGenLCG) {
            return ((RandNumberGenLCG) generator).generateRandomNumber();
        } else {
            throw new IllegalStateException("Unknown generator type.");
        }
    }
}


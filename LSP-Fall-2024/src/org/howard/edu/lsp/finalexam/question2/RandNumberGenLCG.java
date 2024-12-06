package org.howard.edu.lsp.finalexam.question2;

public class RandNumberGenLCG {
	private long seed;

    /**
     * @param seed the initial seed value for the random number generator. 
     */
    public RandNumberGenLCG(long seed) {
        this.seed = seed;
    }

    /**
     * @return a random generated integer.
     */
    public int generateRandomNumber() {
        // Apply the LCG formula to generate the next random number
        seed = (1664525L * seed + 1013904223L) % (1L << 32);
        return (int) seed;
    }
   }
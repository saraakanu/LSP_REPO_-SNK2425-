package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Using Java's built-in random number generator
        service.setGenerator(new BuiltInRandomNumberGenerator());
        System.out.println("Built-in random: " + service.getRandomNumber());

        // Using Linear Congruential Generator (LCG)
        service.setGenerator(new RandNumberGenLCG(12345));
        System.out.println("LCG random: " + service.getRandomNumber());
    }	

}

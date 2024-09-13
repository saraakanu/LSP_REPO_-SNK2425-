
package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCount{
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		File file = new File("sample.txt");
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = br.readLine()) != null) {
	            //System.out.println(line);
	            for (String word : line.split(" ")) {
	            	if (word.length() > 3) {
	            		int count = (word.contains("'")) ? 2 : 1;	
	            		word = word.replaceAll("[^a-zA-Z]", "");
	            		word = (word.matches("[a-zA-Z]$") ? word : word.substring(0, word.length()));	            		
	            		word = word.toLowerCase();		
	            		if (!wordCount.containsKey(word)) {
	            			wordCount.put(word,count);
	            		}else if (wordCount.containsKey(word)) { 
	            			wordCount.put(word, wordCount.get(word) + count);
	            		    //System.out.println(word + "  " + wordCount.get(word));
	            			}
	            		}
	            	}
	            line = br.readLine();
	        	}
	        
	        //br.close();
	        wordCount.forEach((k,v) -> System.out.println(k + " " + v));
	        
	        //System.out.println(word + "  " + wordCount.get(word));
	        } 
	    }
//TO DO: make sure no punctuation

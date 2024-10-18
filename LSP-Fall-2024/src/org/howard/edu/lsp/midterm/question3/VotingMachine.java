package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

public class VotingMachine {
    private HashMap<String, Integer> candidates; 

    public VotingMachine() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String name) {
        candidates.put(name, 0); 
    }

    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); 
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}
//** https://stackoverflow.com/questions/27273680/voting-system-java\

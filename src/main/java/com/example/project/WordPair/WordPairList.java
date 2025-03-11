package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int x = 0; x < words.length - 1; x++){
          for (int y = x + 1; y < words.length; y++){
              allPairs.add(new WordPair(words[x], words[y]));
          }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }

    public int numMatches() {
        /* to be implemented in part (b) */
        int counter = 0;
        for (int j = 0; j < allPairs.size(); j++){
            if (allPairs.get(j).getFirst().equals(allPairs.get(j).getSecond())){
                counter++;
            }
        }
        return counter;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}

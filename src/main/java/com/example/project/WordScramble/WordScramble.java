package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  
   public static String scrambleWord(String word) {
    ArrayList<String> wordArr = new ArrayList<>();
    int idx = -1;
      for (int x = 0; x < word.length(); x++){
        wordArr.add(word.substring(x, x + 1));
      }
      for (int y = 0; y < wordArr.size() - 1; y++){
        if (wordArr.get(y).equals("A") && !(wordArr.get(y + 1).equals("A")) && idx < y){
            wordArr.set(y, wordArr.get(y+1));
            wordArr.set(y + 1, "A");
            idx = y + 1;
        }
      }
      String scrambledWord = "";
      for (int z = 0; z < wordArr.size(); z++){
      scrambledWord += wordArr.get(z);
      }
      return scrambledWord;
  }

  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
  
   public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
    /* to be implemented in part (b) */
    
    ArrayList<String> wordArr = new ArrayList<String>();
    for (int x = 0; x < wordList.size(); x++) {
      wordArr.add(wordList.get(x));
      wordArr.set(x, scrambleWord(wordArr.get(x)));
    }

    ArrayList<String> updatedWordArr = new ArrayList<String>();
    for (int y = 0; y < wordArr.size(); y++){
      if (!wordArr.get(y).equals(wordList.get(y))){
        updatedWordArr.add(wordArr.get(y));
      }
    }
    return updatedWordArr;
}
}

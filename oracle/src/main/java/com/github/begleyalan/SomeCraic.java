package com.github.begleyalan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abegley on 07/08/2014.
 * Interview question supplied to a Software Engineer. Reverse every other word in a String literal
 * Implemented it for the craic! :)
 */
public class SomeCraic {

    public static void main(String [] args){
        final SomeCraic craic = new SomeCraic();
        System.out.println(craic.reverseEveryOtherWord("Reverse"));
        System.out.println(craic.reverseEveryOtherWord("There is no place like home"));
        System.out.println(craic.reverseEveryOtherWord("Mary had a little lamb blah blah"));
    }

    private final String reverseWord(final String word){
        final char[] reversedWord = new char[word.length()];
        for(int i=word.length(); i > 0; i--){
            reversedWord[(word.length() - i)] = word.charAt(i-1);
        }
        return new String(reversedWord);
    }

    public final String reverseEveryOtherWord(final String words){
        final List<String> listOfWords = new ArrayList<String>(Arrays.asList(words.split(" ")));
        final StringBuilder result = new StringBuilder();
        final int numOfWords = listOfWords.size();
        for(int i = 0; i <= numOfWords-1; i++){
            if(i % 2 == 0){
                result.append(reverseWord(listOfWords.get(i)));
            }else{
                result.append(listOfWords.get(i));
            }

            if(numOfWords != 1 && i<=numOfWords-2){
                result.append(" ");
            }
        }
      return result.toString();
    }
}

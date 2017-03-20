package com.upsight.codequiz;

import com.upsight.codequiz.services.DictionaryCollection;
import com.upsight.codequiz.services.DictionaryCollectionInterface;

public class DictionaryDemo {

    public static void main(String[] args){

        DictionaryCollectionInterface dc1 = new DictionaryCollection(128);

        //call to save some words in dictionary
        dc1.insert("sarcasm", "the use of irony to mock or convey contempt");
        dc1.insert("guru", "an influential teacher or popular expert");
        dc1.insert("millennial", "a person reaching young adulthood in the early 21st century");
        dc1.insert("vaunting", "having a boastfully proud disposition");
        dc1.insert("arithmancy", "divination by the use of numbers, especially by the number of letters in names");
        dc1.insert("furtive", "done by stealth");
        dc1.insert("felicitously", "in a pleasing way");
        dc1.insert("fest", "a time or program of special events and entertainment in honor of something");
        dc1.insert("feign", "to present a false appearance of");

        //retrieve the meaning of given word
        String query = "feign";
        System.out.println(query+":: "+dc1.findDefinitionOf(query));
        //delete the entry of given word from dictionary
        dc1.delete("feign");
        //retrieve the meaning of given word
        System.out.println(query+":: "+dc1.findDefinitionOf(query));

        //retrieve the words matching the given prefix
        dc1.findWordsWithPrefix("fe");

    }
}

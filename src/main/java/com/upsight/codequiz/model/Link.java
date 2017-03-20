package com.upsight.codequiz.model;

/**
 * Created by prasad on 3/19/2017.
 * custom Link class created to map every single dictionary entry
 * */
public class Link {

    private DictionaryEntry dictionaryData;
    public Link next;

    public Link(String key, String value) {
        dictionaryData = new DictionaryEntry(key, value);
    }

    public String getKey() {
        return dictionaryData.getKey();
    }

    public String getValue(){
        return dictionaryData.getValue();
    }

    public void displayLink() {
        System.out.print(dictionaryData.getKey() + " ");
    }
}
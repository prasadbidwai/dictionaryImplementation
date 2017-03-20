package com.upsight.codequiz.model;

/**
 * Created by prasad on 3/19/2017.
 * Model class used to represent every entry in the dictionary
 */
public class DictionaryEntry {

    private String key, value;

    public DictionaryEntry(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return this.key;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }
}

package com.upsight.codequiz.services;

/**
 * Created by prasad on 3/19/2017.
 */
public interface DictionaryCollectionInterface {

    public int hashFunc(String word);
    public void insert(String word, String definition);
    public void delete(String key);
    public String findDefinitionOf(String word);
    public void findWordsWithPrefix(String word);
}

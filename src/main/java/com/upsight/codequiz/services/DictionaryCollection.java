package com.upsight.codequiz.services;

import com.upsight.codequiz.model.Link;
import com.upsight.codequiz.model.LinkList;

/**
 * Created by prasad on 3/19/2017.
 */
public class DictionaryCollection implements DictionaryCollectionInterface {

    private LinkList[] hashArray;
    private int arraySize;

//  constructor to inititalize dictionary collection
    public DictionaryCollection(int size) {
        arraySize = size;
        hashArray = new LinkList[arraySize];
        for (int j = 0; j < arraySize; j++)
            hashArray[j] = new LinkList();
    }

//  function to calculate hash location to save the given word
    public int hashFunc(String key) {

        int i = key.toLowerCase().charAt(0);
        return i;
    }

    public void insert(String key, String value) {

        int hashVal = hashFunc(key);//calculate the hash value to find location of the given word
        hashArray[hashVal].insert(key, value);  //call function to insert the entry into the link list at hashed array location
    }

    public void delete(String key) {

        System.out.println("the word being deleted::"+ key);
        int hashVal = hashFunc(key);    //calculate the hash value to find location of the given word
        hashArray[hashVal].delete(key); //call the function to delete the entry from link list for given word
    }

    public String findDefinitionOf(String key) {

        int hashVal = hashFunc(key);    //calculate the hash value to find location of the given word
        Link theLink = hashArray[hashVal].find(key);
        if(theLink!=null)
            return theLink.getValue();
        return null;
    }

//    function to find dictionary for words matching given pattern/prefix
    public void findWordsWithPrefix(String key) {

        int hashVal = hashFunc(String.valueOf(key.charAt(0)));  //calculate the hash value to find location of the given word

        System.out.println("the dictionary being searched for prefix: "+key);

        if (key.length() == 1) {
            LinkList theLink = hashArray[hashVal];
            theLink.displayList();
        }else {
            LinkList currentLink = hashArray[hashVal];
            Link first = currentLink.getFirst();
            Link current = first;
            while (current != null){
                if (current.getKey().contains(key)){
                    current.displayLink();
                }
            current = current.next;
            }
        }
    }
}


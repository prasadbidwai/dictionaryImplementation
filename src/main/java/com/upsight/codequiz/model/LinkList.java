package com.upsight.codequiz.model;

/**
 * Created by prasad on 3/19/2017.
 * custom class created to implement LinkList which is used to store dictionary entries
 */
public class LinkList {

    private Link first;

    public void LinkList() {
        first = null;
    }

    public Link getFirst(){
        return first;
    }

    public void insert(String key, String value) {
        Link newLink = new Link(key,value);
        newLink.next = first;
        first = newLink;
    }

    public Link delete(String key) {

        Link current = first; // search for link
        Link previous = first;
        while(current.getKey() != key) {
            if (current.next == null){
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public Link find(String key) {

        Link current = first;
        if(current!=null) {
            while (current.getKey() != key) {
                if (current.next == null)
                    return null;
                else
                    current = current.next;
            }
            return current;
        }else {
            return null;
        }
    }

    public void displayList() {

        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
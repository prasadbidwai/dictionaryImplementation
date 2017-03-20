package com.upsight.codequiz;
import com.upsight.codequiz.services.DictionaryCollection;
import com.upsight.codequiz.services.DictionaryCollectionInterface;
import org.junit.Test;
import static org.junit.Assert.*;

public class DictionaryCollectionTest {

    @Test
    public void checkIfRetrieves(){
        DictionaryCollectionInterface dc = new DictionaryCollection(128);

        //inserting sample records using insert function
        dc.insert("a", "alphabet a");
        dc.insert("b", "alphabet b");

        //check if correct data is inserted & retrieved.
        assertEquals(dc.findDefinitionOf("a"), "alphabet a");
        assertEquals(dc.findDefinitionOf("b"), "alphabet b");

        // no data is inserted so null should be retrieved for "c"
        assertEquals(dc.findDefinitionOf("c"),null);
    }

    @Test
    public void checkIfDeletes(){
        DictionaryCollectionInterface dc = new DictionaryCollection(128);

        //inserting sample records using insert function
        dc.insert("a", "alphabet a");
        dc.insert("b", "alphabet b");

        //check if correct data is inserted & retrieved & check if null is retrieved after its deleted.
        assertEquals(dc.findDefinitionOf("a"), "alphabet a");
        dc.delete("a");
        assertEquals(dc.findDefinitionOf("a"), null);
    }
}

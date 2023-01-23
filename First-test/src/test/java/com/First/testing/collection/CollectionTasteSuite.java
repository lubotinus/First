package com.First.testing.collection;
import org.junit.jupiter.api.*;
import com.First.testing.collection.OddNumberExterminator

import java.util.ArrayList;
import java.util.List;

public class CollectionTasteSuite {

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> emptyList = new List<Integer>;

     OddNumberExterminator oddNumberExterminator;
        oddNumberExterminator = new OddNumberExterminator();

        oddNumberExterminator.exterminate(emptyList);

    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> emptyList = new List<Integer>;
       for (int i=1, i<10; i++){
            emptyList.add(i);
        }

        OddNumberExterminator oddNumberExterminator;
        oddNumberExterminator = new OddNumberExterminator();

        oddNumberExterminator.exterminate(emptyList);

    }
}

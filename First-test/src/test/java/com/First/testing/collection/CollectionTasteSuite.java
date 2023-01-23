package com.First.testing.collection;
import org.junit.jupiter.api.*;
import com.First.testing.collection.OddNumberExterminator;

import java.util.ArrayList;
import java.util.List;

public class CollectionTasteSuite {

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
         OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        List<Integer> result = oddNumberExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> normaList = new ArrayList<>();
       for (int i=1; i<=10; i++){
            normaList.add(i);
        }

       List<Integer> expectedResult = new ArrayList<>();
       expectedResult.add(2);
       expectedResult.add(4);
       expectedResult.add(6);
       expectedResult.add(8);
       expectedResult.add(10);

        //When
        List<Integer> result = oddNumberExterminator.exterminate(normaList);
        System.out.println("Testing norma list");

        //Then

        Assertions.assertEquals(expectedResult, result);

    }
}

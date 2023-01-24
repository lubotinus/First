package com.First.testing.collection;
import org.junit.jupiter.api.*;
import com.First.testing.collection.OddNumberExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTasteSuite {

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
         OddNumberExterminator oddNumberExterminator = new OddNumberExterminator(emptyList);
        //When
        List<Integer> result = oddNumberExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
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
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator(normaList);
        List<Integer> result = oddNumberExterminator.exterminate(normaList);
        System.out.println("Testing norma list");

        //Then

        Assertions.assertEquals(expectedResult, result);

        System.out.println("Used asList");
        Integer[]arr = new Integer [result.size()];
        result.toArray(arr);
        List<Integer> asListResult = Arrays.asList(arr);
        System.out.println("asList result: " + asListResult);

    }

}

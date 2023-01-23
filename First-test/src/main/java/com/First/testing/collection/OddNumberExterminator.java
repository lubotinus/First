package com.First.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {
    List<Integer> numbers = new ArrayList<>();

    public OddNumberExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> outList = new ArrayList<>();
        for (int reciveNumber : numbers) {
            if (reciveNumber % 2 == 0) {
                outList.add(reciveNumber);

            }
        }
        exterminate().add(outList);

    }

}

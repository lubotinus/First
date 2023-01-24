package com.First.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {
    public List<Integer> inputList = new ArrayList<>();


    public OddNumberExterminator(List<Integer> inputList) {
        this.inputList = inputList;
    }

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> outList = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                int n = numbers.get(i);
                outList.add(n);

            }
        }
        return outList;
    }

}

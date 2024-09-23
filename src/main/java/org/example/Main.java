package org.example;

import org.example.tasks.*;


import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Set.of(12, 2, 3, 10, 7);

        List<Integer> l1 = List.of(1, 15, 2, 1, 1, 1, 3, 3, 13, 21);

        SetDifferenceCalculator sdc = new SetDifferenceCalculator();
        UniqueNumberExtractor une = new UniqueNumberExtractor();

        System.out.println(sdc.calculateDifference(set1, set2));

        System.out.println(une.extractUniqueNumbers(l1));
    }
}
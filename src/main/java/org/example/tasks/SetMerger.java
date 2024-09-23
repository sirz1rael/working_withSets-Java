package org.example.tasks;

import java.util.HashSet;
import java.util.Set;

public class SetMerger {
    public Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2) throws Exception {
        if (set1.isEmpty() || set2.isEmpty()) throw new Exception("One of arguments is empty :(");

        UniqueNumberExtractor une = new UniqueNumberExtractor();

        Set<Integer> unique1 = une.extractUniqueNumbers(set1.stream().toList());
        Set<Integer> unique2 = une.extractUniqueNumbers(set2.stream().toList());

        Set<Integer> mergedSet = new HashSet<>();

        mergedSet.addAll(unique1);
        mergedSet.addAll(unique2);

        return mergedSet;
    }
}

package org.example.tasks;

import java.util.*;

public class UniqueNumberExtractor {
    public Set<Integer> extractUniqueNumbers(List<Integer> numbers) throws Exception {

        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> duplicatesList = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        numbers.forEach( n -> {
            if (!seenNumbers.add(n)) duplicatesList.add(n);
        });

        numbers.forEach(k -> {
            if (duplicatesList.add(k)) uniqueNumbers.add(k);
        });

        if (!uniqueNumbers.isEmpty()) return uniqueNumbers;
        else if(numbers.isEmpty()) throw new Exception("Entry list is empty :(");
        else throw new Exception("No unique numbers there :(");
    }

    public Set<Integer> removeDuplicates(List<Integer> numbers) {
        return new HashSet<>(numbers);
    }

}

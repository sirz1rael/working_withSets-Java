package org.example.tasks;

import java.util.Set;

public class SetIntersectionChecker {
    public boolean isIntersecting(Set<Integer> set1, Set<Integer> set2) throws Exception {

        if (set1.isEmpty() || set2.isEmpty()) throw new Exception("One of arguments is empty :(");

        return set1.containsAll(set2);
    }
}

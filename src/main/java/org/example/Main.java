package org.example;

import org.example.tasks.*;


import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Set.of(4, 6, 3, 1);

        SetIntersectionChecker sic = new SetIntersectionChecker();

        System.out.println(sic.isIntersecting(set1, set2));

    }
}
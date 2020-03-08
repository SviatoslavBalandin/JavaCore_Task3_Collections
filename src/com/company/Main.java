package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //        First task
        String[] wordArray = {"list", "collection", "list", "linked", "array", "list", "array", "list", "linked", "iteration"};

        printUniqueWordsFromStringArray(wordArray);

        printNumberOfSameWordsInsideOfStringArray(wordArray);
        // end of first task

        //        Second task
        Phonebook phonebook = new Phonebook();
        phonebook.add("06736263267", "Pupkin");
        phonebook.add("0878282738", "Petrov");
        phonebook.add("0658332998", "Vasychkin");
        phonebook.add("09402493434", "Pupkin");
        phonebook.add("06457375343", "Alibabaev");
        phonebook.add("08743848343", "Alibabaev");
        phonebook.add("07637636741", "Pupkin");

        System.out.println(phonebook.get("Pupkin"));
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Taburetkin"));


    }

    private static void printUniqueWordsFromStringArray (String[] array) {
        //make list from array and put it in as an argument in hashSet constructor
        Set<String> uniqueWords = new HashSet<>(List.of(array));
        System.out.println(uniqueWords);
    }

    private static void printNumberOfSameWordsInsideOfStringArray (String[] array) {
        Map<String, Integer> counterMap = new HashMap<>();
        // been used lesson template ))
        for (String s : array) {
            counterMap.put(s, counterMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(counterMap);
    }
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("My");
        collection.add(" name");
        collection.add(" is");
        collection.add(" John");
        collection.add(" Doe");
        printCollection(collection);
        collection.stream()
                .forEach((each) -> {
                    for (int i = 0; i < collection.size(); i++) {
                        collection.set(i, collection.get(i).toUpperCase());
                    }
                });
        System.out.println();
        printCollection(collection);
    }

    public static void printCollection(ArrayList collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(collection.get(i));
        }
    }
}

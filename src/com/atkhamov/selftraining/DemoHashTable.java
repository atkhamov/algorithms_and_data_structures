package com.atkhamov.selftraining;

import java.util.Enumeration;
import java.util.Hashtable;

public class DemoHashTable {
    public static void main(String[] args) {
        //Creating a hash-map
        Hashtable scoreList = new Hashtable();
        Enumeration keysOfHashTable;
        String key;
        double score;

        scoreList.put("Masha", new Double(3434.34));
        scoreList.put("Michael", new Double(123.22));
        scoreList.put("Ollegah", new Double(1378.00));
        scoreList.put("Denis", new Double(99.21));
        scoreList.put("Anton", new Double(-19.08));

        //Shows all the scores in the hash-table
        keysOfHashTable = scoreList.keys();
        System.out.println(keysOfHashTable); //this doesn't work properly
        while (keysOfHashTable.hasMoreElements()){
            key = (String) keysOfHashTable.nextElement();
            System.out.println(key + ": " + scoreList.get(key));
        }
        System.out.println();

        //Add extra score to Masha's score
        score = ((Double) scoreList.get("Masha")).doubleValue();
        scoreList.put("Masha", new Double(score + 800));
        System.out.println("New score of Masha: " + scoreList.get("Masha"));
    }
}

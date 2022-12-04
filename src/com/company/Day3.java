package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        try {
          String dataTest="""
                  vJrwpWtwJgWrhcsFMMfFFhFp
                  jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                  PmmdzqPrVvPwwTWBwg
                  wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                  ttgJtRGJQctTZtZT
                  CrZsJsPPZsGzwwsLwLmpwMDw
                  """;


            BufferedReader br = new BufferedReader(new FileReader("input_3/input.txt"));
            int score = 0;
            String alfabet= "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//            String line;
//            while ((line = br.readLine()) != null) {
//
//             // for (String line : dataTest.split("\n")) {
//                int[ ] chars=new int [line.length()];
//                int i=0;
//                for (String e: line.split("")) {
//                    chars[i]=alfabet.indexOf(e);
//                    i++;
//
//                }
//                int[] first = Arrays.copyOfRange(chars, 0, chars.length / 2);
//                int[] second = Arrays.copyOfRange(chars, chars.length / 2, chars.length);
//                Set<Integer> scores = new HashSet<>();
//                for (int k = 0; k < first.length; k++) {
//                    for (int j = 0; j < second.length; j++) {
//                        if (first[k] == second[j]) {
//                            scores.add(first[k]);
//                        }
//                    }
//                }
//                score += scores.stream().reduce((a, b) -> a + b).get();
//            }
//
//            System.out.println(score);

            List<Set<Integer>> lists = new ArrayList<>();
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            int listIdx = 0;
            String line;
            while ((line = br.readLine()) != null) {
                //for (String line : testdata.split("\n")) {
                for (String e : line.split("")) {
                    lists.get(listIdx).add(alfabet.indexOf(e));
                }
                listIdx++;
                if (listIdx < 3) {
                    continue;
                }

                lists.get(0).retainAll(lists.get(1));
                lists.get(0).retainAll(lists.get(2));

                score += lists.get(0).stream().reduce((a, b) -> a + b).get();

                lists = new ArrayList<>();
                lists.add(new HashSet<>());
                lists.add(new HashSet<>());
                lists.add(new HashSet<>());
                listIdx = 0;
            }
            System.out.println(score);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

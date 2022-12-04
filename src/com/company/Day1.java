package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("inputs/input_1_day.txt"));
            ArrayList<Integer> elf = new ArrayList<Integer>();

            String line;
            int summ = 0;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) {

                    elf.add(summ);
                    summ = 0;
                    continue;
                }
                int i = Integer.parseInt(line);
                summ += i;

            }
            elf.add(summ);
            int max=0;
            //1 shart
//            for (int i = 0; i < elf.size(); i++) {
//                if (elf.get(i) > max) {
//                    max = elf.get(i);
//                }
//            }
//            System.out.println(max);

            //2 shart
            Collections.sort(elf);

            for (int i = elf.size()-1; i > elf.size()-4; i--) {
                max += elf.get(i);
            }


            System.out.println(max);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

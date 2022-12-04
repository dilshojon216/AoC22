package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {
        try {
            int couts = 0;
            BufferedReader br = new BufferedReader(new FileReader("inputs/input_4_day.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                 String[] as=line.split(",");
                 int[] a=new int[4];
                 int ssd=0;
                 for (int i = 0; i < as.length; i++) {
                       String[] ds=as[i].split("-");
                       a[ssd]=Integer.parseInt(ds[0]);
                          a[ssd+1]=Integer.parseInt(ds[1]);
                            ssd+=2;

                 }

//                 if(a[0]<=a[2] && a[1]>=a[3] || a[0]>=a[2] && a[1]<=a[3]){
//                     couts++;
//                 }
                if(!(a[1]<a[2] || a[0]>a[3])){
                    couts++;
                }

            }

            System.out.println("args = " + couts);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

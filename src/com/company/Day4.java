package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Day4 extends InputData {

    public Day4(String day) {
        super(day);
    }

    @Override
    void solve(List<String> input) {
        int couts = 0;
        int couts1 = 0;

        for (String s : input) {
            String[] parts = s.split(",");
            String[] sec1Parts = parts[0].split("-");
            String[] sec2Parts = parts[1].split("-");
            int sec1Lower = Integer.parseInt(sec1Parts[0]);
            int sec1Upper = Integer.parseInt(sec1Parts[1]);
            int sec2Lower = Integer.parseInt(sec2Parts[0]);
            int sec2Upper = Integer.parseInt(sec2Parts[1]);

            if (sec1Lower <= sec2Lower && sec1Upper >= sec2Upper)
                couts++;
            else if (sec1Lower >= sec2Lower && sec1Upper <= sec2Upper)
                couts++;

            if ((sec1Lower <= sec2Lower && sec1Upper >= sec2Lower) || (sec1Lower <= sec2Upper && sec1Upper >= sec2Upper))
                couts1++;
            else if ((sec2Lower <= sec1Lower && sec2Upper >= sec1Lower) || (sec2Lower <= sec1Upper && sec2Upper >= sec1Upper))
                couts1++;
        }
        lap(couts);
        lap(couts1);
    }
}

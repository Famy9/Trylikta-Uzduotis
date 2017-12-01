package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] skaiciai = {100, 832, 1456, 2, 854};
        Arrays.sort(skaiciai);
        Min(skaiciai);
    }

    public static int Min(int[] skaiciai) {

        int min = skaiciai[0];
        System.out.println(min);
        return min;

    }
}

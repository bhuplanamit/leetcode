package com.bhuplanamit.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Integer arr[] = {9,10,11,12,56,13,1413};
        ArrayList arr2 = new ArrayList();

        arr2 = (ArrayList) Arrays.stream(arr).sorted().collect(Collectors.toList());
        System.out.println(arr2.get(arr.length-2));
    }
}

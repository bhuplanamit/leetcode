
//Find kth Largest Element in a Stream

package com.bhuplanamit.leetcode;

import java.util.*;
public class findKthLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int stream[] = new int[n];
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        List<Integer> list = new ArrayList<>();
        for(int val : stream){
            if (min.size() < k)
                min.add(val);
            else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }
            if (min.size() >= k){
                list.add(min.peek());}
            else{
                list.add(-1);}
        }
        for(int i = 0; i<list.size();i++){
            if(list.get(i) == -1){
                System.out.println("None");
            }else{

                System.out.println(k+""+" largest number is"+" "+ list.get(i));
            }
        }



    }
}


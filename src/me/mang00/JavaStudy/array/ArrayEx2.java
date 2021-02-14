package me.mang00.JavaStudy.array;

public class ArrayEx2 {

    public static void main(String[] args) {

        int[] score = { 100, 99, 88, 77, 66, 55, 100 };

        int max = score[0];
        int min = score[0];

        for(int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            }
            if(score[i] < min) {
                min = score[i];
            }
        } // for end

        System.out.println("max : " + max);
        System.out.println("min : " + min);

    } // main end
} // class end

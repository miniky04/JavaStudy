package me.mang00.JavaStudy.array;

public class ArrayEx1 {
    public static void main(String[] args) {

        int sum = 0;
        float average;

        int[] score = {100, 95, 90, 100, 80, 85};

        for (int j : score) {
            sum += j;
        }
        average = sum / (float)score.length;

        System.out.println("total : " + sum);
        System.out.println("average : " + average);

    }
}

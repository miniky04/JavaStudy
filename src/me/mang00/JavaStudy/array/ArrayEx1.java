package me.mang00.JavaStudy.array;

public class ArrayEx1 {
    public static void main(String[] args) {

        int sum = 0;
        float average;

        int[] score = {100, 95, 90, 100, 80, 85};

        // 향상된 for 문
        // 기존의 for 문과 다른점 : 인덱스를 제공해주지 않는다.
        // 주의할 점 : 배열 내부의 값을 변경할 때는 이전 방식을 사용해야한다. (향상된 for문 사용불가능)
        for (int j : score) { // 객체 : 배열
            sum += j;
        }
        average = sum / (float)score.length;

        System.out.println("total : " + sum);
        System.out.println("average : " + average);

    }
}

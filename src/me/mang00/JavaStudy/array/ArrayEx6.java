package me.mang00.JavaStudy.array;

public class ArrayEx6 {
    public static void main(String[] args) {

        int[] number = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] = (int)(Math.random() * 10));

        System.out.println();

        for (int i = 0; i < number.length; i++)
            // number[i] 값을 ++ 해주는 명령문
            counter[number[i]]++;

        for (int i = 0; i < number.length; i++)
            System.out.println(i + "의 개수 : " + counter[i]);

    }
}

package me.mang00.JavaStudy.array;

public class ArrayEx3 {
    public static void main(String[] args) {

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            // number 배열을 0 ~ 9의 숫자로 초기화한다.
            number[i] = i;
            System.out.print(number[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 중의 한 값을 임의의 수로 얻어온다.
            int n = (int) (Math.random() * 10);
            int temp = number[0];
            number[0] = number[n];
            number[n] = temp;
        }

        for (int i = 0; i < number.length; i++) {
            // number 배열 출력
            System.out.print(number[i]);
        }
    }
}

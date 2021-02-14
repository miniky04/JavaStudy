package me.mang00.JavaStudy.array;

public class ArrayEx5 {
    public static void main(String[] args) {

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] = (int) (Math.random() * 10));

        System.out.println();

        for (int i = 0; i < number.length; i++) {
            // 자리바꿈이 발생했는지를 체크한다.
            boolean changed = false;

            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    // 자리바꿈이 발생했으니 changed 를 true 로 바꿔준다.
                    changed = true;
                } // end if
            } // end for j

            if (!changed) break; // 자리 바꿈이 없을 시 반복문을 벗어난다.

            for (int k = 0; k < number.length; k++)
                System.out.print(number[k]);
            System.out.println();

        } // end for i
    }
}

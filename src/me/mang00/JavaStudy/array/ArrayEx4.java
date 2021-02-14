package me.mang00.JavaStudy.array;

public class ArrayEx4 {
    public static void main(String[] args) {

        // ball 배열이 int로 45개 생성
        int[] ball = new int[45];

        // for , if 등 밑에 한 줄만 올 경우 생략 가능 ( 아래, 옆으로 한개의 명령문 가능 )
        for (int i = 0; i < ball.length; i++) ball[i] = i + 1;

        int change = 0; // 두 값을 바꾸는데 사용할 임시 변수
        int num = 0; // 임의의 값을 얻어서 저장할 변수

        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 45);
            change = ball[0];
            ball[0] = ball[num];
            ball[num] = change;
        }

        for (int i = 0; i < 6; i++) System.out.print(ball[i] + " ");

    }
}

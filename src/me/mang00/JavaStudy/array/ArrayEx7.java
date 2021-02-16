package me.mang00.JavaStudy.array;

public class ArrayEx7 {
    public static void main(String[] args) {

        char[] hex = {'C', 'A', 'F', 'E'};

        // 16진수 'C' = 12 = 1100, 'A' = 10 = 1010 'F' = 15 = 1111 'E' = 14 = 1110
        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"};

        String result = "";

        // 아스키코드 참고해서 보기
        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0'];
            } else {
                result += binary[hex[i] - 'A' + 10];
            }
        }

        System.out.println("hex : " + new String(hex)); // new String(n) n을 String 으로 변환
        System.out.println("binary : " + result);

    }
}

package week3.pps_2025_07_18;

import java.util.Scanner;
import java.util.StringTokenizer;

//A148 단어의 개수 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을지 구하는 문제
public class A148_ParkEunJu_20250718 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringTokenizer arr = new StringTokenizer(str, " "); //StringTokenizer로 공백 무시.

        System.out.println(arr.countTokens()); // countTokens()로 토큰 확인 = 단어 개수 !!
    }
}


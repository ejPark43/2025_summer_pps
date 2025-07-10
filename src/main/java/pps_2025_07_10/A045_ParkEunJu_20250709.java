package pps_2025_07_10;

import java.util.Scanner;

// A045 단어 공부:  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성한다.

public class A045_ParkEunJu_20250709 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String word = s.next();

        word = word.toUpperCase();

        String[] word_chars = word.split("");
        int[] alphabetCount = new int[26];

        for(int i=0; i<word.length(); i++){
            alphabetCount[word_chars[i].charAt(0) - 65] ++;

        }

        int max=-100;
        char result = '?'; // 여러 알파벳이 동일하게 같이 사용되었다면 물음표
        for(int i=0; i<26; i++){

            if(max==alphabetCount[i])   {
                result = '?';

            }
            if(alphabetCount[i]>max) {
                max = alphabetCount[i];
                result = (char)(i+'A');
            }
        }

        System.out.println(result);
    }

}

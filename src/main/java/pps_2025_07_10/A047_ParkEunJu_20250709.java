package pps_2025_07_10;

import java.util.Scanner;

// A047 열개씩 끊어 출력하기:  입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다.

public class A047_ParkEunJu_20250709 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String word = s.next();
        int length = word.length();
        for(int i=length; i>=1; i-=10){
            if(word.length()<10) System.out.println(word);
            else{
                System.out.println(word.substring(0, 10));
                word = word.substring(10);
            }
        }


    }

}

package week3.pps_2025_07_14;

import java.util.Scanner;

//A106 등장하지 않는 문자의 합  : 주어진 문자열에서 등징하지 않는 문자의 아스키코드를 더하는 문제

public class A106_ParkEunJu_20250714 {


    public static void main(String args[]) {


        Scanner s = new Scanner(System.in);


        int n = Integer.parseInt(s.nextLine());// test case
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            int sum=0;
            int[] chars = new int[26];
            String str = s.nextLine();

            for(int j=0; j<str.length(); j++) {
                chars[str.charAt(j)-65]++; // 해당 char의 ascii - 65한 곳이 0~25번까지의 배열 번호가 된다. 해당 배열 원소를 ++ 해줌

            }
            for(int j=0; j<26; j++) {
                if(chars[j]==0) sum+=j+65; // 문자가 안나왔다면 chars[j]부분이 0일것이기 때문에, j+65를 해주면 원본문자의 ascii값이 나옴.
            }
            ans[i] = sum;
        }

        for(int i=0; i<n; i++) {
            System.out.println(ans[i]);
        }
    }
}

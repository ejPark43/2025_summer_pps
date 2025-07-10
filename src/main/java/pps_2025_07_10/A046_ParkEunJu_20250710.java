package pps_2025_07_10;

import java.util.Scanner;

// A046 농구 경기:  농구 선수를 선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이 모두 출력하고 그렇지 않으면 PREDAJA를 출력하는 문제

public class A046_ParkEunJu_20250710 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        String [] names = new String[N];
        int[] alphabet = new int[26]; // 알파벳 몇개 나오는지 세기 위해서 개수 저장할 배열 선언
        for(int i = 0; i<N; i++){
            names[i] = s.nextLine();
            char c = names[i].charAt(0); // 각 이름의 첫 알파벳
            alphabet[c-'a']++; // 현재 알파벳 ascii-97 하면 0~26까지 범위 사이로 들어가게 됨.
            // System.out.println("name: "+ names[i]);
            // System.out.println("alphabet: "+alphabet[c-97]);

        }

        boolean exist = false;
        for(int i=0; i<26; i++) {
            if(alphabet[i]>=5) { // 다섯명 이상이 뽑혀야 함
                System.out.printf("%c",i+'a'); // ascii 코드로 소문자 알파벳은 97 더해야 나오므로
                exist = true;
            }

        }
        if(exist == false) System.out.println("PREDAJA");
    }

}

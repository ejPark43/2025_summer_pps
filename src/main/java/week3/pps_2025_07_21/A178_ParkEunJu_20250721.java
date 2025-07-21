
package week3.pps_2025_07_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//A178 포켓몬마스터 (포켓몬 이름 입력받고, 번호 입력하면 해당 번호의 포켓몬 출력 or 포켓몬 입력받으면 해당 포켓몬의 번호 출력 )
public class A178_ParkEunJu_20250721 {
    public static void main(String[] args)throws IOException {
        // *** 시간복잡도 중요..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strs = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(strs[0]); // 포켓몬 개수
        int M = Integer.parseInt(strs[1]);// 들어올 입력값 개수

        Map<Integer,String> map1 = new HashMap<>(); // 두가지 경우로 다 찾을수 있게 hashmap 만듦
        Map<String,Integer> map2 = new HashMap<>();
        for(int i=1;i<=N;i++) {
            String pocketmon = br.readLine();
            map1.put(i, pocketmon);// 포켓몬번호, 포켓몬이름
            map2.put(pocketmon, i);// 포켓몬이름, 포켓몬번호
        }
        for(int i=0;i<M;i++) {// 검색할 포켓몬 번호 혹은 이름 입력받는 반복문
            String s = br.readLine();
            if(49 <= s.charAt(0) && s.charAt(0) <= 57) {// 들어온 입력값이 0~9인 숫자라면 숫자 hashmap에서 찾아야함.
                int key = Integer.parseInt(s);
                sb.append(map1.get(key));
            }
            else sb.append(map2.get(s));

            sb.append("\n"); // \n을 붙여줘서 나중에 출력할때 띄워준다

        }
        System.out.println(sb);

    }

}


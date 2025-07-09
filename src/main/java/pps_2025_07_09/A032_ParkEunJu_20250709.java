package pps_2025_07_09;

import java.util.Scanner;

// A032 부녀회장이 될 테야 : 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력한다. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
public class A032_ParkEunJu_20250709 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int[][] count = new int[15][15];
        for(int a=0; a<15; a++){
            count[a][1]=1; // 모든 층의 1호는 1이다
            count[0][a] = a; // 0층 값. 0호는 없으니까 이렇게 a를 넣어줘도 1층부터 넣어주게됨.
        }

        for(int i=1; i<15; i++){ // 1층 - 14층
            for(int j=2; j<15; j++){ // 2호 - 14호
                count[i][j] = count[i][j-1]+count[i-1][j]; // (i층의 j-1호 값) + (i-1층의 j호) = i층 j호
            }
        }

        int t = s.nextInt(); // test case
        int[] answers = new int[t];
        for(int i=0; i<t; i++){ // test case만큼 반복

            int k = s.nextInt();//층 k
            int n = s.nextInt(); // 호 n
            answers[i]=count[k][n];
        }
        for(int i=0; i<t; i++)System.out.println(answers[i]); //정답 출력




    }


}

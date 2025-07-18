package week3.pps_2025_07_18;

import java.util.Scanner;

//A149 덩치 : 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력
public class A149_ParkEunJu_20250718 {

    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);


        int n = Integer.parseInt(s.nextLine()); // test case
        int [][] arr = new int[n][2]; // 몸무게, 키 넣을 배열
        for(int i=0; i<n; i++) {
            arr[i][0] = s.nextInt(); // 몸무게
            arr[i][1] = s.nextInt(); // 키
        }
        for(int i =0; i<n; i++) {
            int rank = 1; // 모든 경우에서 일단 랭크는 1로 시작해서, 아래에서 자기보다 더 큰 사람 존재하면 랭크 ++ 해서 확인.
            for(int j =0; j<n; j++) {
                if(i==j) continue; // 같은사람은 비교 X
                //키와 몸무게가 모두 j가 더 클때 rank 하나씩 더함.
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) rank++;


            }
            System.out.print(rank+" ");
        }
    }

}


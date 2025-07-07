package pps_2025_07_07;
import java.util.Scanner;

// A008 평균은 넘겠지, 백준 4344번 문제


public class A008_ParkEunJu_20250707 {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
int n = s.nextInt(); // test case 개수 n
    float [] answer = new float[n];
    for (int i = 0; i<n; i++){ //입력된 테스트 케이스 개수만큼 반복
        int counts = s.nextInt();
        int [] scores = new int[counts];
        int sum = 0;

    for( int j = 0; j<counts; j++){ // 한 테스트 케이스에서 점수를 모두 저장 및 합을 구함
        scores[j] = s.nextInt();
        sum+=scores[j];
    }
        float avg = (float) sum/counts;
      int moreThanAvg = 0; // 평균보다 높은 학생 수

        for (int j =0; j<counts; j++){
           if(scores[j] > avg){
               moreThanAvg ++;
           }

         }


        answer[i]= (float)moreThanAvg/counts * 100;


    }

    for (int i=0; i<n; i++){
        String ans = String.format("%.3f", answer[i]);
        System.out.println(ans+"%");
    }
}

}

/*
예제 입력:
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

예제 출력:
40.000%
57.143%
33.333%
66.667%
55.556%
*/

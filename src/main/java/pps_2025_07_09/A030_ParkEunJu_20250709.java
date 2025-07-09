package pps_2025_07_09;

import java.util.Scanner;

// A030 좋은 날 싫은 날 : N일 뒤의 재현이의 기분이 좋은 날일 확률과 싫은 날일 확률에 1,000을 곱해 소수점 첫째자리에서 반올림한 수를 차례대로 출력한다.
public class A030_ParkEunJu_20250709 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // N일
        int today = s.nextInt(); // 오늘의 기분 0: 좋음, 1: 나쁨
        float good = 0;
        float bad = 0;
        float good_temp;
        float bad_temp;
        float[] mood = new float[4];

        for(int i=0; i<4; i++) mood[i]=s.nextFloat();
    /* moods[]
    n
   0: 지금 좋고 다음 날도 좋을 확률
   1: 지금 좋고 다음날 싫을 확률
   2: 지금 싫고 다음날 좋을 확률
   3: 지금 싫고 다음날도 싫을 확률
    */

        if(today ==0) { // 오늘 좋을때 good, bad 초기값
            good = mood[0];
            bad = mood[1];
        }
        else if(today ==1) { // 오늘 안좋을때  good, bad 초기값
            good= mood[2];
            bad= mood[3];
        }

        for(int i=0; i<n-1; i++) {
            good_temp = good*mood[0] + bad*mood[2]; //다음날 좋은 기분일 확률
            bad_temp = bad*mood[3] + good*mood[1]; // 다음날 안좋은 기분일 확률
            good = good_temp;
            bad = bad_temp;

        }
        good *=1000;
        bad *=1000;
        System.out.println((int)good);
        System.out.println((int)bad);

    }


}

package pps_2025_07_09;
import java.util.*;
// A022 휴대폰 요금: 통화 시간 목록이 주어졌을 때, 청구 방식이 다른 두 가지 요금제 중 더 저렴한 요금제를 구하는 문제.
public class A022_ParkEunJu_20250709 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n= s.nextInt(); // 맨 처음 들어오는 N
        int Y = 0;
        int M = 0;
        int t=0;
        for(int i=0; i<n; i++) {
            t=s.nextInt();
            if(t%30==0) { // 30초, 60초 등 30의 배수일땐 한번 더 더해야하므로, +1해서 각 요금제 곱해줌
                Y+=((t/30)+1) *10;
                M+=((t/60)+1)*15;
            }
            else { // 30의 배수가 아닐때는 시간/30, 시간/60을 한 값의 ceil한 값만큼 요금제 곱함.
                Y+=(int) 10*(int)Math.ceil((float)t/(float)30); // 예: 31만큼 통화시간이 들어오면 31/30 = 1.xxxx이 되므로, ceil값인 2를 써서 2*10하면 20원을 내야한다.
                M+=15*(int)Math.ceil((float)t/(float)60); // 예: 61이면 ceil(61/60) = 2이므로, 15*2 = 30원.
            }
        }
        if(Y<M) System.out.printf("Y %d", Y);
        else if (M<Y) System.out.printf("M %d", M);
        else System.out.printf("Y M %d", Y);

    }


}

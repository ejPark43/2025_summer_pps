package week3.pps_2025_07_21;

import java.util.Scanner;

//A191 A + B
public class A191_ParkEunJu_20250721 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int cases = s.nextInt();
        int[] answers = new int[cases];
        for(int i=0; i<cases; i++){
            int A = s.nextInt();
            int B = s.nextInt();
            answers[i] = A+B;
        }
        for(int i=0; i<cases; i++){
            System.out.println(answers[i]);
        }

    }
}


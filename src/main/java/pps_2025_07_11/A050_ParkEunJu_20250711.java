package pps_2025_07_11;

import java.util.Scanner;

// A050 카이사르 암호:  입력받은 카이사르 단어를 원래 단어로 고쳐서 출력한다.

public class A050_ParkEunJu_20250711 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        for (String c: str.split("")){

            switch(c) {
                case "D" : c = "A";
                    break;
                case  "E": c = "B";
                    break;
                case  "F": c = "C";
                    break;
                case  "G": c = "D";
                    break;
                case  "H": c = "E";
                    break;
                case  "I": c = "F";
                    break;
                case  "J": c = "G";
                    break;
                case  "K": c = "H";
                    break;
                case  "L": c = "I";
                    break;
                case  "M": c = "J";
                    break;
                case  "N": c = "K";
                    break;
                case  "O": c = "L";
                    break;
                case  "P": c = "M";
                    break;
                case  "Q": c = "N";
                    break;
                case  "R": c = "O";
                    break;
                case  "S": c = "P";
                    break;
                case  "T": c = "Q";
                    break;
                case  "U": c = "R";
                    break;
                case  "V": c = "S";
                    break;
                case  "W": c = "T";
                    break;
                case  "X": c = "U";
                    break;
                case  "Y": c = "V";
                    break;
                case  "Z": c = "W";
                    break;
                case  "A": c = "X";
                    break;
                case  "B": c = "Y";
                    break;
                case  "C": c = "Z";
                    break;
            }
            System.out.print(c);

        }
    }



}

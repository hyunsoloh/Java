package 연습.javaFestival;

import java.util.Scanner;

public class ex31_0120 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====알파벳 빈도수 구하기====");
        System.out.print("입력>> ");
        String input = sc.nextLine();
        sc.close();
        for(int i = 65 ; i <=90 ; i++){
            System.out.print((char)i + " : ");
            int cnt = 0;
            for(int j = 0 ; j < input.length(); j++){
                char inputChar = input.charAt(j);
                int k = i+32;
                if((char)i == inputChar || (char)k == inputChar){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

package 연습.javaFestival;

import java.util.Scanner;

public class ex14_0114 {
    public static void main(String[]aStrings) {
        int multi = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("입력:");
        int input = sc.nextInt();
        for(int i = 1; i<=input;i++){
            multi = multi *i;
        }
        System.out.println("출력:"+multi);
        sc.close();
    }
    
}

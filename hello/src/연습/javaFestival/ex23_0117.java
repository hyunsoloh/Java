package 연습.javaFestival;

import java.util.Scanner;

public class ex23_0117 {
    public static void main(String[]aStrings) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수입력:");
    int input = sc.nextInt();
    String inputStr = input + "";
    int sum = 0;
    int j =1;
    int k =1;
    sc.close();
    for(int i = 0; i<inputStr.length() ; i++){
        j = 10*j;
        sum = sum + (input%j)/k;
        input = input-input%j;
        k = 10*k;
    }
    System.out.println("합은 "+sum + "입니다.");
    }
}

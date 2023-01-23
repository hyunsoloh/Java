package 연습.javaFestival;

import java.util.Scanner;
// 아스키코드를 이용한 문제입니다.
// 아스키표를 구글링하여 문제를 풀어봅시다.
// ex22 에서 설명했던 String 을 char 로 형변화하면 쉽게 풀수 있습니다.(다른방법 모릅니다.)
public class ex31_0120 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====알파벳 빈도수 구하기====");
        System.out.print("입력>> ");
        String input = sc.nextLine();
        sc.close();
        for(int i = 65 ; i <=90 ; i++){                            // A 부터 Z 의 아스키코드 범위.
            System.out.print((char)i + " : ");
            int cnt = 0;                                           //변수 cnt 는 입력된 문자의 알파벳을 count해주기위한 변수입니다.
            for(int j = 0 ; j < input.length(); j++){
                char inputChar = input.charAt(j);
                int k = i+32;                                      //아스키코드 표를 보시면 아시겠지만 대분자에 +32 를 하면 해당 대문자의 소문자입니다.
                if((char)i == inputChar || (char)k == inputChar){  //대문자이거나 소문자일때 true.
                    cnt++;                                         //조건문의 명제가 참을때 카운트 해 줍니다.
                }
            }
            System.out.println(cnt);
        }
    }
}

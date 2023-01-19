package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class ex28_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 입력 >> ");
        int num1 = sc.nextInt();
        System.out.println("두 번쨰 숫자 입력 >> ");
        int num2 = sc.nextInt();
        sc.close();
        String num2leaght = num2+"";
        ArrayList<Integer> arrayNum = new ArrayList<>();
        for(int i = 1 ; i <= num2leaght.length() ; i++){
            arrayNum.add(num2%10);
            num2/=10;
        }
        int sum = 0;
        int j = 1;
        for(int i = 0 ; i<arrayNum.size(); i++){
            sum =sum + num1*arrayNum.get(i)*j;
            j*=10;
            System.out.println(num1*arrayNum.get(i));
        }
        System.out.println("총합 : " + sum);
    }
}

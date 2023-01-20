package 연습.javaFestival;

import java.util.Scanner;

public class ex27_0118 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 6 , 2 , 5 , 5 , 4 , 5 , 6 , 3, 7 ,6};
        System.out.print("첫자리 0을 제외한 숫자를 입력해 주세요 >> ");
        int input = sc.nextInt();
        sc.close();
        String inputLenght = input+"";
        int sum = 0;
        for(int i = 0 ; i < inputLenght.length(); i++){
            sum = sum + array[input%10];
            input/=10;
        }
        System.out.print("대시('-')의 총합 >> " + sum );

    }
}

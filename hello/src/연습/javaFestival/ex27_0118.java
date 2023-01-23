package 연습.javaFestival;

import java.util.Scanner;

public class ex27_0118 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 6 , 2 , 5 , 5 , 4 , 5 , 6 , 3, 7 ,6};   // 0 부터 9 까지의 - 갯수를 배열에 넣어 생성.
        System.out.print("첫자리 0을 제외한 숫자를 입력해 주세요 >> ");
        int input = sc.nextInt();
        sc.close();
        String inputLenght = input+"";                          // 입력받은 숫자의 갯수(자릿수)를 알기위해 문자열로 형변환
        int sum = 0;
        for(int i = 0 ; i < inputLenght.length(); i++){         
            sum = sum + array[input%10];                        // array[i] 는 숫자 i의 '-' 갯수임으로 입력된 값의 1의자리부터 합산을 시작
            input/=10;                                          // 1의자리를 합산했으니 1의자리를 날려주는 연산
        }                                                       // for문을 통해 이를 반복.
        System.out.print("대시('-')의 총합 >> " + sum );

    }
}

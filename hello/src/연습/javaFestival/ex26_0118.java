package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class ex26_0118 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N 입력 >>");
        int input1 = sc.nextInt();
        System.out.print("X 입력 >>");
        int input2 = sc.nextInt();
        int[] array = new int[input1];                          // 입력받은 정수를 저장하기위한 배열을 생성.
        ArrayList<Integer> result = new ArrayList<>();          // 결과값(X보다 작은 정수) 를 저장하기위한 ArrayList 
        for(int i = 0; i<input1; i++){
            System.out.print(i+1 + "번째 정수 입력>>");
            int input = sc.nextInt();
            array[i] = input;
            if(array[i]<input2){                                // X보다 작은 정수를 저장
                result.add(array[i]);
            }
        }
        sc.close();
        System.out.print("결과 >> " );
        for(int i = 0 ; i<result.size(); i++){                  // 몇개의 정수가 X보다 작을지는 미정이기 때문에 .size를 이용
            System.out.print(result.get(i)+" ");
        }

    }
}

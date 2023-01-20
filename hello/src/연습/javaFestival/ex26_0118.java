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
        int[] array = new int[input1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<input1; i++){
            System.out.print(i+1 + "번째 정수 입력>>");
            int input = sc.nextInt();
            array[i] = input;
            if(array[i]<input2){
                result.add(array[i]);
            }
        }
        sc.close();
        System.out.print("결과 >> " );
        for(int i = 0 ; i<result.size(); i++){
            System.out.print(result.get(i)+" ");
        }

    }
}

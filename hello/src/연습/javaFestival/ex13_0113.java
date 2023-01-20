package 연습.javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex13_0113 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int[] arr = new int[8];
        int largeNum = 0;
        int smallNum = 0;
        System.out.print("배열에 있는 모든 값 : ");
        for(int i = 0 ; i<arr.length ; i++){
            int j = rm.nextInt(100);             // for 문 안에서 랜덤한 수를 넣는 작업을 해야 반복될때마다 다른 수가 나옴
            arr[i]=j;                                   // 베열에 랜덤한 j 값을 넣는다.
            System.out.print(arr[i]+" ");
            // 최댓값 찾는작업.
            if(arr[largeNum]<arr[i]){
                largeNum = i;
            }
            //최소값 찾는작업.
            if(arr[smallNum]>arr[i]){
                smallNum = i;
            }
        }
        sc.close();
        System.out.println();
        System.out.println("가장 큰 값:" + arr[largeNum]);
        System.out.println("가장 작은 값:" + arr[smallNum]);


    }
    
}

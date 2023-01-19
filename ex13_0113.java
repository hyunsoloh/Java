package 연습.javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex13_0113 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int[] arr = new int[8];
        int lnum = 0;
        int snum = 0;
        System.out.print("배열에 있는 모든 값 : ");
        for(int i = 0 ; i<8 ; i++){
            int j = rm.nextInt(100);
            arr[i]=j;
            System.out.print(arr[i]+" ");
            if(arr[lnum]<arr[i]){
                lnum = i;
            }
            if(arr[snum]>arr[i]){
                snum = i;
            }
        }
        sc.close();
        System.out.println();
        System.out.println("가장 큰 값:" + arr[lnum]);
        System.out.println("가장 작은 값:" + arr[snum]);


    }
    
}

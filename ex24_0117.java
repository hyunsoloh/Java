package 연습.javaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class ex24_0117 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0 ; i<array.length; i++){
            System.out.print((i+1)+"번쨰 수 입력 : ");
            int j = sc.nextInt();
            array[i] = j;
        }
        sc.close();
        for(int i = 0 ; i<array.length-1; i++){
            int small = i;
            for(int j = i; j<array.length; j++){
                if(array[j]<array[small]){
                    small=j;
                }
            }
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;

        }
        System.out.println("정렬 후");
        System.out.println(Arrays.toString(array));
    }
    
}

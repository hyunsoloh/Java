package 연습.javaFestival;

import java.util.Scanner;

public class ex17_0115 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0 ; i<10 ; i++){
            System.out.print((i+1) + "번 째 정수 입력>>");
            int j =sc.nextInt();
            array[i] = j;
         }
         sc.close();
         System.out.print("3의 배수 : ");
         for(int i = 0 ; i<10 ; i++){
            if(array[i]%3==0){
                System.out.print( array[i]+" ");
            }
         }

    }
}

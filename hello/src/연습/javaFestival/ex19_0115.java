package 연습.javaFestival;

import java.util.Scanner;

public class ex19_0115 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i<array.length;i++){
            System.out.print(i + "번쨰 별의 수: ");
            int j = sc.nextInt();
            array[i] = j;
        }
        sc.close();
        for(int i =0; i<array.length;i++){
            System.out.print(array[i] + ":");
            for(int j = 0 ; j < array[i] ; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

package 연습.javaFestival;

import java.util.Scanner;

public class ex16_0114 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 입력>>");
        int n = sc.nextInt();
        sc.close();
        int sum = 1;
        for(int i = 0; i<n ; i++){
            sum += i;
            System.out.print(sum+" ");
        }

    }
}

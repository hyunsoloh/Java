package 연습.javaFestival;

import java.util.Scanner;

public class ex19_0115 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i<array.length;i++){                 
            System.out.print((i+1) + "번쨰 별의 수: ");
            int j = sc.nextInt();
            array[i] = j;                               // array[i] 에 별의 입력된 별의 갯수를 배열
        }
        sc.close();
        for(int i =0; i<array.length;i++){              // 열을 결정하는 반복문 --- 0부터4까지음으로 5열
            System.out.print(array[i] + ":");
            for(int j = 0 ; j < array[i] ; j++){        // 별을 출력하는 반복문(행)  --- 0부터 array[i] 
                System.out.print("*");                // 즉 위에서 입력받은 array[i]의 값 만큼 별을 출력하는것을 반복한다.

            }
            System.out.println();           
        }

    }
}

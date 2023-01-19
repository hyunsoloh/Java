package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

// public class ex20_0116 {                                    
//     public static void main(String[]aStrings) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         System.out.println("정수 입력:");
//         int input = sc.nextInt();
//         sc.close();
//         for(int i = 0 ; i < input ; i++){
//             for(int j = 0; j < input ; j++){
//                 arr.add(j,  (i+1) + (input*j));
//                 System.out.print(arr.get(j) + "\t");
//             }System.out.println();
//         }
//     }
// }
public class ex20_0116 {                          //다음문제 
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("정수 입력:");
        int input = sc.nextInt();
        sc.close();
        for(int i = 0 ; i < input ; i++){
            for(int j = 0; j < input ; j++){
                arr.add(j,  (j+1) + (input*i));                  //input*값과 ()+1값을 변경
                System.out.print(arr.get(j) + "\t");
            }System.out.println();
        }
    }
}

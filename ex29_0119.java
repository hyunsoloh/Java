package 연습.javaFestival;

import java.util.Scanner;

public class ex29_0119 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======채점하기======");
        String input = sc.next();
        sc.close();
        int[] array = new int[input.length()];

        for(int i = 0 ; i < input.length() ; i++){
            char j = input.charAt(i);
            array[i] = j;
        }
        
        int sum = 0 ;
        int cnt = 1;
        
        for(int i = 0 ; i<array.length ; i++){
            if(array[i] == 'o'){
                sum+=cnt;
                cnt++;
            }else if(array[i] == 'x'){
                cnt = 1;
            }
        }
        
        System.out.println("총합 : " + sum);
 
    }
}

package 연습.javaFestival;

import java.util.Scanner;

public class ex15_0114 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력>>");
        int input = sc.nextInt();
        int j =1;
        sc.close();
        for(int i = 1 ; i<=input ; i=i*2 ){
            j = i;
        }
        for(int k = j ; k>0; k=k/2 ){
            
            if(input/k==0){
                System.out.print(" " + 0 + " ");
            }else{
                System.out.print(" " + 1 + " ");
                input=input-k;
            }
        }   
       
    }
    
}

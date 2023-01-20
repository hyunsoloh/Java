package 연습.javaFestival;

//import java.util.ArrayList;
import java.util.Scanner;

public class ex15_0114 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

//      for문 이용
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
//----------------------------------------------------------------------------------------
//      배열을 이용한 방법 
        // System.out.print("숫자를 입력 하세요 : ");
        // int num = sc.nextInt();
        // int num2 = num;
        // ArrayList<Integer> arr = new ArrayList<>();
        // num2 = num;
        // while(num2>0) {
        //     arr.add(num2%2); 
        //     num2/=2;
        // }
        // System.out.print("10진수 "+num+"의 2진수는 ");
        // for(int i = arr.size(); i>0; i--) {
        //     System.out.print(arr.get(i-1));
        // }
        // System.out.println(" 입니다.");     
    }
    
}

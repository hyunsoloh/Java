package 연습.javaFestival;

import java.util.Random;

public class ex18_0115 {
    public static void main(String[]aStrings) {
        //로또번호는 1 ~ 45 까지 숫자를 6개 선택

        Random rm = new Random();
        int[] array = new int[6];
        int i = 0;
        for( i = 0; i<array.length ; i++){
            int j = rm.nextInt(44);
            array[i]=j;
        
            for(int k = 0; k<array.length ; k++){               // 중복을 탐색하는 알고리즘
         
                if(k!=i)                                        // 같은 배열 제외
                if(array[k]==array[i]){                         // 조건문으로 배열에서 중복이 발생할 경우 
                    System.out.println("중복되었습니다.");     
                    --i;                                        // i를 -1 하여 해당 배열에 다시 랜덤한 숫자를 넣도록 조정
                }
            }
        }
    
        for( int k = 0; k<array.length ; k++){
            System.out.print(array[k] + " ");
        }

    }
}

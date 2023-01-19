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
        
        for(int k = 0; k<array.length ; k++){
         
                if(k!=i)
                if(array[k]==array[i]){
                    System.out.println("중복되었습니다.");
                    --i;
                }
            }
        }
    
        for( int k = 0; k<array.length ; k++){
            System.out.print(array[k] + " ");
        }

    }
}

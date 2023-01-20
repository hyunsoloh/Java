package 연습.javaFestival;

public class ex06_0110 {
    public static void main(String[]aStrings) {
        // 1번풀이 합계만 출력 가능함.
        // int sum = 0;
        // int i,j;
        
        // for(i=1,j=-2; j>= -100 || i<=99 ;j-=2 ,i+=2){
            
        //     if(i%2==0){
        //         sum-=i;
        //     }else{
        //         sum+=i;
        //     }
        //     }
        //     System.out.println(sum);
    
        // 수의 배열과 합계까지 출력하는법. 
        int sum = 0;
        int temp = 0;                   // 임시변수(temp) 를 for문 밖에 선언한다.
        for(int i = 1; i<=100; i++){
            if(i%2==0) temp = -i;       
            else temp = i;
            System.out.print(temp+" ");  
            sum+=temp;
        }
        System.out.println();
        System.out.println("총합 : " + sum);
    }
    
}

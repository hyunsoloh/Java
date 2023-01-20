package 연습.javaFestival;

public class ex07_0111 {
    public static void main(String[]aStrings) {
        int sum = 0;
        int i,j ;           
        for(i = 77; i>0; i--){
            j=78-i;                     // 변수 i는 77부터 1씩 감소하며 변수 j는 1부터 77까지 증가한다.
            sum+=i*j;                   // sum=sum+i*j  
        }
        System.out.println(sum);
    }
    
}

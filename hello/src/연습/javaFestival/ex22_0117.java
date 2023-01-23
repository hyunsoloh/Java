package 연습.javaFestival;


// 문자열(String) 울 문자로(char) 로 형변환하여 쉽게 문제를 풀 수 있습니다.
public class ex22_0117 {
    public static void main(String[]aStrings) {
       String score = "A,A,B,C,D,A,C,D,D,D,F";

       int a=0; int b=0; int c=0; int d=0; int f=0; 
   
       for(int i = 0; i<score.length() ; i++){     // 문자열의 길이는 배열의 길이를 구할때 처럼 .leghth() 를 쓴다면 쉽게 구할수 있습니다. *주의 문자열의 길이를 구할때에는 .length() <== 괄호가 들어갑니다.
           char scoreC =score.charAt(i);           // char 변수 = (String변수).chatAt(인덱스);-->String을char로 형변환
           if(scoreC=='A')a++;                     // 해당 형변화는 몬자열을 문자들의 배열로 변환한다 생각하시면 이해하기 쉽습니다.
           else if(scoreC=='B')b++;                // 예를들어 "a,b,c" 라는 문자열은 배열로서 {'a' , ',' , 'b' , ',' ,  'c'} 입니다. 길이가 5인 배열이죠.
           else if(scoreC=='C')c++;                
           else if(scoreC=='D')d++;
           else if(scoreC=='F')f++;
           }
        System.out.println("A : " + a + "명");
        System.out.println("B : " + b + "명");
        System.out.println("C : " + c + "명");
        System.out.println("D : " + d + "명");
        System.out.println("F : " + f + "명");
    }
}

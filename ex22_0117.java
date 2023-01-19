package 연습.javaFestival;

public class ex22_0117 {
    public static void main(String[]aStrings) {
       String score = "A,A,B,C,D,A,C,D,D,D,F";

       int a=0; int b=0; int c=0; int d=0; int f=0; 
   
       for(int i = 0; i<score.length() ; i++){
           char scoreC =score.charAt(i);           //char 변수 = (String변수).chatAt(인덱스);-->String을char로 형변환
           if(scoreC=='A')a++;
           else if(scoreC=='B')b++;
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

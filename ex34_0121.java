package 연습.javaFestival;

public class ex34_0121 {
    public static void main(String[]aStrings) {
        int num1 = 50;
        int num2 = 15;
        char op = '*';
        System.out.println(cal(num1 , num2 , op));
        
    }
    private static int cal(int num1,int num2,char op) {
        if(op == '*') {
            int i =num1*num2;
            return i;
        }else if(op == '-'){
            int i = num1 - num2;
            return i;
        }else if(op == '+'){
            int i = num1 + num2;
            return i;
        }else if(op == '/'){
            int i = num1 / num2;
            return i;
        }else return 0;
    }
}


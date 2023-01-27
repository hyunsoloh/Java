package 연습.자바문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Break3085_1 {
    public static void main(String[]aStrings) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] candy = new char[n][n];
        for(int i = 0 ; i<n ; i++){                    
            String input = br.readLine();
            for(int j = 0; j<n ; j++){
                candy[i][j] = input.charAt(j);
            }
        }
        int result = 0;


        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<n-1; j++){
                // swichValue(candy,i,j);
                char temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;
                if(result<=serch(candy)){
                    result = serch(candy);
                }
                temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;

            }
        }
       
        for(int i = 0; i<n; i++){                               
            for(int j = 0 ; j<n-1; j++){
                char temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;
                if(result<=serch(candy)){
                    result = serch(candy);
                }
                temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;
            }
        }
      
        System.out.println(result);



    }

    // public static void swichValue(char a, char b) {
    //     char temp = a;
    //     a = b;
    //     b = temp;
    // }
 
    public static int serch(char[][] array) {          //행 과 열을 탐색하는 메소드.
        int big = 0;
        for(int i = 0 ; i<array.length; i++){          //행을 탐색하여 인접한 원소의 최댓값을 계산
            int cnt = 1;
            for(int j = 0; j<array.length-1; j++){
                if(array[i][j]==array[i][j+1]){
                    cnt++;
                }else{
                    cnt = 1;
                } 
                if(big<=cnt)big=cnt;    
            }
        }
    
        for(int i = 0 ; i<array.length; i++){           // 열을 탐색하여 인접한 원소의 최댓값을 계산
            int cnt = 1;
            for(int j = 0; j<array.length-1; j++){
                if(array[j][i]==array[j+1][i]){
                    cnt++;
                }else{
                    cnt = 1;
                } 
                if(big<=cnt)big=cnt;    
            }
        }
        return big;
    }
    


}

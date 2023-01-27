package 연습.자바문제;

import java.util.ArrayList;

public class Beak3085 {
    public static void main(String[]aStrings) {
        //입력 : N
        //입력 : CPP
        //       CPP
        //       PPC  -->출력3
        int N = 3;                  // i+1 j /i+1 j+1 / i+1 j-1 / i일때 i-1 일때 i와 j 는 >0
        char[][] candy = {{'C','C','P'},
                          {'C','C','P'},
                          {'P','P','C'}};
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i<N ; i++){
            for(int j = 0; j<N ; j++){
                if(i!=j){
                if(i+1<3 && candy[i][j]!=candy[i+1][j] ){
                 char temp = candy[i][j];
                 candy[i][j] = candy[i+1][j];
                 candy[i+1][j] = temp;
                 if(candy[i][0]==candy[i][1]&&candy[i][0]==candy[i][2]){
                    array.add(3);
                 }else if(candy[i][0]==candy[i][1] || candy[i][1]==candy[i][2] ){
                    array.add(2);
                 }else array.add(1);
                 if(candy[0][j]==candy[1][j]&&candy[i][j]==candy[2][j]){
                    array.add(3);
                 }else if(candy[0][j]==candy[1][j]|| candy[1][j]==candy[2][j]){
                    array.add(2);
                 }else array.add(1);
                }
                if(i-1>0 && candy[i][j]!=candy[i-1][j]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i-1][j];
                    candy[i-1][j] = temp;
                    if(candy[i][0]==candy[i][1]&&candy[i][0]==candy[i][2]){
                       array.add(3);
                    }else if(candy[i][0]==candy[i][1] || candy[i][1]==candy[i][2] ){
                       array.add(2);
                    }else array.add(1);
                    if(candy[0][j]==candy[1][j]&&candy[i][j]==candy[2][j]){
                       array.add(3);
                    }else if(candy[0][j]==candy[1][j]|| candy[1][j]==candy[2][j]){
                       array.add(2);
                    }else array.add(1);
                }
                if( j+1<3 && candy[i][j]!=candy[i][j+1]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = temp;
                    if(candy[i][0]==candy[i][1]&&candy[i][0]==candy[i][2]){
                       array.add(3);
                    }else if(candy[i][0]==candy[i][1] || candy[i][1]==candy[i][2] ){
                       array.add(2);
                    }else array.add(1);
                    if(candy[0][j]==candy[1][j]&&candy[i][j]==candy[2][j]){
                       array.add(3);
                    }else if(candy[0][j]==candy[1][j]|| candy[1][j]==candy[2][j]){
                       array.add(2);
                    }else array.add(1);
                }
                if(j-1>0 && candy[i][j]!=candy[i][j-1]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i][j-1];
                    candy[i-1][j] = temp;
                    if(candy[i][0]==candy[i][1]&&candy[i][0]==candy[i][2]){
                       array.add(3);
                    }else if(candy[i][0]==candy[i][1] || candy[i][1]==candy[i][2] ){
                       array.add(2);
                    }else array.add(1);
                    if(candy[0][j]==candy[1][j]&&candy[i][j]==candy[2][j]){
                       array.add(3);
                    }else if(candy[0][j]==candy[1][j]|| candy[1][j]==candy[2][j]){
                       array.add(2);
                    }else array.add(1);
                   }

                }
            }
        }
        int max = 0;
        for(int i = 0; i<array.size() ; i++){
            if(array.get(i)>=max)max=array.get(i);
        }
        System.out.println(max);

        
    }
   
    
  
}

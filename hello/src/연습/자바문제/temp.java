package 연습.자바문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class temp {
    public static void main(String[]aStrings) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] candy = new char[N][N];
        for(int i = 0; i<N ; i++){
            String ar = br.readLine();
            for(int j = 0 ; j<N ; j++){
                candy[i][j] = ar.charAt(j);
            }
        }
        br.close();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<N ; j++){
                int cnt1 = 1;
                int cnt2 = 1; 
                for(int k = 0; k<N ; k++){
                    if(j!=k){
                    if(candy[i][j]==candy[i][k]){
                        cnt1++;
                    }else {
                        cnt1 = 1;
                    }
                    }
                    }
                    count.add(cnt1);
                for(int k = 0; k<N ; k++){
                    if(i!=k) { 
                    if(candy[i][j]==candy[k][j]){
                        cnt2++;
                    }else {
                        count.add(cnt2);
                        cnt2 = 1;
                    }
                    }
                    }
                    count.add(cnt2);
                }
            }

        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<N ; j++){
                int cnt1 = 1;
                int cnt2 = 1;
            if(i!=j){
                if(i+1<N && candy[i][j]!=candy[i+1][j]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i+1][j];
                    candy[i+1][j] = temp; 
                    cnt1=1; cnt2=1;   
                for(int k = 0; k<N ; k++){
                    if(j!=k){
                    if(candy[i][j]==candy[i][k]){
                        cnt1++;
                    }else {
                        cnt1 = 1;
                    }
                    }
                    }
                    count.add(cnt1);
                for(int k = 0; k<N ; k++){
                    if(i!=k) { 
                    if(candy[i][j]==candy[k][j]){
                        cnt2++;
                    }else {
                        count.add(cnt2);
                        cnt2 = 1;
                    }
                    }
                    }
                    count.add(cnt2);
                    candy[i+1][j] = candy[i][j];
                    candy[i][j] = temp;
                    
                } 
                if(i-1>=0 && candy[i][j]!=candy[i-1][j]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i-1][j];
                    candy[i-1][j] = temp;
                    cnt1=1; cnt2=1;    
                for(int k = 0; k<N ; k++){
                    if(j!=k){
                    if(candy[i][j]==candy[i][k]){
                        cnt1++;
                    }else {
                        cnt1 = 1;
                    }
                    }
                    }
                    count.add(cnt1);
                for(int k = 0; k<N ; k++){
                    if(i!=k){
                        if(candy[i][j]==candy[k][j]){
                        cnt2++;
                    }else {
                        cnt2 = 1;
                    }
                    }
                    }
                    count.add(cnt2);
                    candy[i-1][j] = candy[i][j];
                    candy[i][j] = temp;
                } 
                if(j+1<N && candy[i][j]!=candy[i][j+1]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = temp;
                    cnt1=1; cnt2=1;    
                    for(int k = 0; k<N ; k++){
                        if(j!=k){
                        if(candy[i][j]==candy[i][k]){
                            cnt1++;
                        }else {
                            cnt1 = 1;
                        }
                        }
                        }
                        count.add(cnt1);
                    for(int k = 0; k<N ; k++){
                        if(i!=k) { 
                        if(candy[i][j]==candy[k][j]){
                            cnt2++;
                        }else {
                            cnt2 = 1;
                        }
                        }
                        }
                    count.add(cnt2);
                    candy[i][j+1] = candy[i][j];
                    candy[i][j] = temp;
                }                                  
                if(j-1>=0 && candy[i][j]!=candy[i][j-1]){
                    char temp = candy[i][j];
                    candy[i][j] = candy[i][j-1];
                    candy[i][j-1] = temp;
                    cnt1=1; cnt2=1;     
                    for(int k = 0; k<N ; k++){
                        if(j!=k){
                        if(candy[i][j]==candy[i][k]){
                            cnt1++;
                        }else {
                            cnt1 = 1;
                        }
                        }
                        }
                        count.add(cnt1);
                    for(int k = 0; k<N ; k++){
                        if(i!=k) { 
                        if(candy[i][j]==candy[k][j]){
                            cnt2++;
                        }else {
                            cnt2 = 1;
                        }
                        }
                        }
                    count.add(cnt2);
                    candy[i][j-1] = candy[i][j];
                    candy[i][j] = temp;
                } 
            }
            }
        }
        int max = 0;
        for(int i = 0; i<count.size() ; i++){
            if(count.get(i)>=max)max=count.get(i);
        }
        System.out.println(max);
    }
}

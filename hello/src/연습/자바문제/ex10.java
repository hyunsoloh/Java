package 연습.자바문제;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====자판기 프로그램=====");
        System.out.print("금액을 입력하세요--->");
        int input = sc.nextInt();
        System.out.println("====메뉴를 고르세요====");
        System.out.print("||[1].콜라(800원) [2].생수(500원) [3].비타민워터(1500원)||>>");
        int menu = sc.nextInt();
        
        int coke = 800;
        int water = 500;
        int bwater = 1500;
        int exchange = 0;
                
        if(menu==1) exchange = input-coke;
        if(menu==2) exchange = input-water;
        if(menu==3) exchange = input-bwater;
        if(exchange<0){
            System.out.println("돈이 부족해요ㅠㅠ");
            System.out.println("잔돈:"+input);
            System.out.println("천원:"+(input/1000)+"개, 오백원:"+(input%1000/500)+"개, 백원"+(input%500/100)+"개");
            
         }else{            
            System.out.println("잔돈:"+exchange);
            System.out.println("천원:"+(exchange/1000)+"개, 오백원:"+(exchange%1000/500)+"개, 백원"+(exchange%500/100)+"개");}
        sc.close();
            
    }
 

}



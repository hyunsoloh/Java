package 연습.javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class teem_test {
    public static void main(String[]aStrings) {
        ArrayList<String> book_name = new ArrayList<>();
		ArrayList<Integer> book_price = new ArrayList<>();
		ArrayList<String> book_publisher = new ArrayList<>();
		ArrayList<String> book_author = new ArrayList<>();
		ArrayList<Integer> book_grade = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====도서 관리 프로그램======");
			System.out.println("1.등록 2.검색 3.평점 4.종료");
			int menu = sc.nextInt();
			if(menu==1) {
				System.out.println("======등록======");
                System.out.print("이름 : ");
                String name =sc.next();
                book_name.add(name);
                System.out.print("가격 : ");
                int price = sc.nextInt();
                book_price.add(price);
                System.out.print("출판사 : ");
                String book =sc.next();
                book_publisher.add(book);
                System.out.print("지은이 : ");
                String author =sc.next();
                book_author.add(author);
                System.out.print("평점 : ");
                int grade = sc.nextInt();
                book_grade.add(grade);
                System.out.println(name+"등록 완료!!");
			}else if(menu==2) {
			    
	               System.out.println("======검색======");
	               System.out.println("검색할 이름을 입력해주세요 : ");
	               String name =  sc.next();
	               int isin =0;
	               for(int i =0; i < book_name.size(); i++) {
	            	   if(name.equals(book_name.get(i))) {
	            	   System.out.println("도서이름  도서가격  출판사  지은이   평점");
	            	   System.out.println(book_name.get(i) + "     "  +
                       book_price.get(i) + "     "+
                       book_publisher.get(i) + "     " + 
                       book_author.get(i) +"       "+ 
                       book_grade.get(i));
	            	   isin++;
                       
	            	   }
	               }
	               if(isin==0) System.out.println("존재하지 않습니다");
	 
	            
			}else if(menu==3) {
				
				System.out.println("=======평점======");
				
				for(int i = 100 ; i>0; i-=10) {
					System.out.print(i+"    ");
					for(int j =0 ; j<book_name.size(); j++) {
						if(book_grade.get(j)>=i)System.out.print("*"+"       ");
						}
					System.out.println();
				}
				System.out.print("     ");
				for(int i = 0 ; i < book_name.size(); i++) {
					System.out.print(book_name.get(i) + " ");
				}
                System.out.println();
			}else if(menu==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else System.out.println("정확한 숫자를 다시 입력해 주세요");
		}sc.close();
    }
}

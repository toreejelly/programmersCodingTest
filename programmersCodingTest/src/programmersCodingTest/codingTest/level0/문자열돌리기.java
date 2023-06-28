package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열돌리기 {

	public static void main(String[] args) {
			/*
			 
			 * 문자열 돌리기
			  
			 * 문제실행 : 문자열 str이 주어집니다.
					    문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
			 * 제한사항 : 
						
			 * 입력 : abcde
			 * 출력 : a
					 b
					 c
					 d
					 e
			 
			 * 결론 : 
			 	1.str.charAt(i) : string 타입으로 받은 문자열을 char 타입으로 한 글자만 받는 함수 
			 		
				2. 
			 	
			 */
		
			Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        
	        for(int i=0; i<str.length(); i++){
	            System.out.println(str.charAt(i));
	        }//for end.
		
	        
	    }
	}



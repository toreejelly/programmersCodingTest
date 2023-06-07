package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열반복해서출력하기 {

	public static void main(String[] args) {
			/*
			 
			 * 문자열 반복해서 출력하기
			 
			 * 문제실행 : 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
			 * 제한사항 : 1 ≤ str의 길이 ≤ 10
						1 ≤ n ≤ 5
						
			 * 입력 : string 5
			 * 출력 : stringstringstringstringstring
			 
			 결론 : 
			 	1. 반복문 
			 		for(int i=0(초기화); i<10(조건식); i++(증감식) {
   					//조건이 참일 경우 for문 내부 실행 
					}
				2. 제한사항 다 들어갔는지 확인
			 	
			 */
		
		   	Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = sc.nextInt();
	        
	        if(str.length()>=1 && str.length()<=10){
	           if(n>=1 && n<=5){ 
	                for(int i=1; i<=n; i++){
	                    System.out.print(str);
	                }//for end
	            }//if end
	        }//if end  
	        
	    }
	}



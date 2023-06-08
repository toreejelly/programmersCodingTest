package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 덧셈식출력하기 {

	public static void main(String[] args) {
			/*
			 
			 * 덧셈식 출력하기
			 
			 * 문제실행 : 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요. 
						
			 * 입력 : 4 5
			 * 출력 : 4 + 5 = 9
			 
			 * 결론 : 
			 	1. 출력에서 띄어쓰기 
			 		
				2. 덧셈
			 	
			 */
		
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        //sum으로 꼭 해야하나
	        int sum = a+b;
	        System.out.println(a + " " + "+ " + b + " " + "= " + sum);
	        
	        System.out.println(a + " + " + b + " = " + (a + b));
            // System.out.println(a + " + " + b + " = " + c);
            //System.out.println(a + " + " + b + " = " + a + b); // 4 + 5 = 45 String으로 인식하여 45가 된다. 
	    }
		
	        	    
	}



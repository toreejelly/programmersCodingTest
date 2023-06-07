package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열_출력하기 {

	public static void main(String[] args) {
		/*
		 
		 * 문자열 출력하기
		 
		 * 문제실행 : 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
		 * 제한사항 : 1 ≤ str의 길이 ≤ 1,000,000
					str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
		 * 입력 : HelloWorld!
		 * 출력 : HelloWorld!			
		 
		 결론 : 
		 	1. >= 와 <= 반대로 쓰면 안됨. 크거나 같다 작거나 같다 이런 순이어야 함.
		 	2. System.out.print		: 출력이 옆으로 계속 붙음
		 	   System.out.println	: 출력후 띄어쓰기 됨. 출력이 밑으로 붙음
		 	3. str.length();		: str의 문자길이 구하기
		 	4. 조건문
		 		if(조건식1){
		 		조건식1이 참이면 실행
		 		}else if(조건식2){
		 		조건식1이 거짓이고 조건식2가 참이면 실행
		 		}else{
		 		조건식 1,2가 거짓이면 실행
		 		}//if end
		 */
		
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      
        if(str.length()>=1 && str.length()<=1000000){
          System.out.print(str);
        }//if end
	
	}

}

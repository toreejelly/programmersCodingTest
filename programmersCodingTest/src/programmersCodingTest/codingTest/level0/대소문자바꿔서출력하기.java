package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
			/*
			 
			 * 대소문자바꿔서출력하기
			 
			 * 문제실행 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 
			  			대문자로 변환해서 출력하는 코드를 작성해 보세요.


			 * 제한사항 : 
						
			 * 입력 : aBcDeFg
			 * 출력 : AbCdEfG
			 
			 결론 : 
			 	1.  Character.isUpperCase()를 사용 대문자인지 구별해서 true false 값을 리턴
					Character.isLowerCase()를 사용 소문자인지 구별해서 true false 값을 리턴
					Character.isDigit()를 사용 숫자인지 구별해서 true false 값을 리턴 
			 		
				2. 
			 	
			 */
		
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        
        //무조건 배열로 바꿔서 해야하는가?
        //for()안에 저런 거 들어가도 됨?어떤 거 들어가는거지?
        for(char b : str.toCharArray()){
            if(Character.isLowerCase(b)){
                result += Character.toUpperCase(b);
            }else{
                result += Character.toLowerCase(b);
            }//if end
        }//for end
        
        System.out.print(result);
		   
		
	        
	    }
	}



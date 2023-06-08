package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열_겹쳐쓰기 {

	
			/*
			 
			 * 문자열_겹쳐쓰기
			 
			 * 문제실행 : 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
			 		    문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
			 		    문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요. 
		
						
			 * 입출력 : my_string	      overwrite_string	s	result
					 "He11oWor1d"	  "lloWorl"	        2	"HelloWorld"
					 "Program29b8UYP"  "merS123"	        7	"ProgrammerS123"

			 
			 * 결론 : 
			 	1. 배열
			 	  타입[]변수이름 = new타입[길이];
			 	  int[] num = new int[4];
			 	  길이가 4인 배열의 인덱스 범위는 0,1,2,3
			 	  num[3]=50; -> 배열 num의 4번째 요소에 50을 저장한다.
			 	  int i = num[3]; -> 배열 num의 4번째 요소의 값을 i에 저장한다. 
			 		
				2. public String substring(startIndex) -> startIndex부터 끝까지의 문자열을 리턴 
				   str.substring(2) ->  String str = "hello";  -> llo
				   
				   public String substring(startIndex, endIndex) -> startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴
				   str.substring(2,4) ->  String str = "hello";  -> ll
			 	
			 */
		
		class Solution {
		    public String solution(String my_string, String overwrite_string, int s) {
		        String answer = "";
		        answer = my_string.substring(0,s) + overwrite_string 
		                 + my_string.substring(overwrite_string.length() + s); 
		        
		        return answer;
		    }
		}
		    
		class Solution1 {
		    public String solution(String my_string, String overwrite_string, int s) {
		        // 코딩 문제는 여기까지만 풀면 된다. 아래 main 은 값 보려고 해놓은 것
		        String temp1 = my_string.substring(0, s);
		        String temp2 = my_string.substring(overwrite_string.length() + s);
		        String answer = temp1 + overwrite_string + temp2;
		        return answer;
		        }
		}
		
}
   
	    
	



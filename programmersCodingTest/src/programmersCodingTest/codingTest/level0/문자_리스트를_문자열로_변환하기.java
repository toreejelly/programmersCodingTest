package programmersCodingTest.codingTest.level0;


public class 문자_리스트를_문자열로_변환하기 {
	public static String solution(String[] arr) {
        String answer = "";
        
        for(int i=0;  i<arr.length; i++){
            answer += arr[i];
        }//for end
        
        return answer;
    }//solution end
	
	
	
	public static void main(String[] args) {
			
		
			/*
			 
			 * 
			 
			 * 문제실행 : 문자들이 담겨있는 배열 arr가 주어집니다. 
			 			arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
		
			 * 입출력 : arr	             result
					  ["a","b","c"]	     "abc"

			 * 결론 : 
			 	1. 배열 개수 세기 
			 		변수이름.length
			 		
				2. 배열 출력
					변수이름[인덱스 번호]

			 */
		
		   
		String[] arr = {"a", "b", "c"}; // 배열이라고 ["a", "b", "c"] 이렇게 선언해서는 안된다.  
		solution(arr);
	        
	    }
	}//class end



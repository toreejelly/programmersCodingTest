package programmersCodingTest.codingTest.level0;


public class 문자열_곱하기 {

	public String solution(String my_string, int k) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++){
            sb.append(my_string);
            answer = sb.toString();
        }//for end
     
        return answer;
        
	}//
	
	public static void main(String[] args) {
			/*
			 
			 * 
			 
			 * 문제실행 : 
			 * 제한사항 : 
						
			 * 입력 : 
			 * 출력 : 
			 
			 * 결론 : 
			 	1. StringBuilder 
			 	.......
			 		
				2. .append
				.....
				
				3. .toString();
				"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
			 	
			 */
		
		   
		
	        
	    }//end
	}//class end



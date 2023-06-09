package programmersCodingTest.codingTest.level0;

class Solution {
    public String solution(String str1, String str2) {
  //범위	   return타입 함수이름 파라미터       파라미터
    	String answer = "";
        
        for(int i = 0; i<str1.length(); i++) {

            // answer += (str1.charAt(i) + "");
            // answer += (str2.charAt(i) + "");
        	
        	// "" 앞 뒤 상관없음 
            answer += (str1.charAt(i) + "" + str2.charAt(i));
            //         타입 char         타입을 String으로 변환시켜줌
            
            //2)
            // answer += (str1.charAt(i) + str2.charAt(i));
          
        }//for end
        
        
        return answer ;
        
        //2)
        //return answer + "" ;
    }//solution end
} //class end




public class 문자열_섞기 {

	/* 
	 
	 * 문자열_섞기
	 
	 * 문제실행 : 길이가 같은 두 문자열 str1과 str2가 주어집니다.
				두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 
				return 하는 solution 함수를 완성해 주세요. 
				
	 * 입출력 : str1		 str2	 result
			  "aaaaa"	"bbbbb"	 "ababababab" 
	 
	 * 결론 : 
	 	1. 메소드 선언 및 호출
	 		
	 	
	 */
	
	//private static void Solution(String string, String string2) {
		// TODO Auto-generated method stub
		
	//}

    public static String solution(String str1, String str2) {
  //범위	          return타입 함수이름 파라미터       파라미터
  //       class안에 함수 만들어서 사용하려면 static 사용해야한다  	
    	String answer = "";
        
        for(int i = 0; i<str1.length(); i++) {

            // answer += (str1.charAt(i) + "");
            // answer += (str2.charAt(i) + "");
        	
        	// "" 앞 뒤 상관없음 
            answer += (str1.charAt(i) + "" + str2.charAt(i));
            //         타입 char         타입을 String으로 변환시켜줌
            
            //2)
            // answer += (str1.charAt(i) + str2.charAt(i));
          
        }//for end
        
        
        return answer ;
        
        //2)
        //return answer + "" ;
    }//solution end
	
	public static void main(String[] args) {
		
		//Solution("aaaaa","bbbbb");
		
		
		//문자열_겹쳐쓰기 문자 = new 문자열_겹쳐쓰기();
		// 1.
		Solution so = new Solution();
		System.out.println(so.solution("aaaaa", "bbbbb"));   
		//so.solution("aaaaa", "bbbbb");
		String a = so.solution("aaaaa", "bbbbb");
		System.out.println(a);
		
		//2.
		solution("aaaaa", "bbbbb");
		System.out.println(solution("aaaaa", "bbbbb"));
		String b = solution("aaaaa", "bbbbb");
		System.out.println(b);
		
	        
	    }//

	
	}//class end



package programmersCodingTest.codingTest.level0;



class flag에_따라_값_반환하기 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        // return flag ? a + b : a - b;
        
        //if 조건은 boolean(거짓.참) 표현식이어야 합니다. 
        //flag == true
        if(flag){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }


	public static void main(String[] args) {
			/*
			 
			 * 문제실행 : 
			 	두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
			 	flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
			 
			 * 입출력 :  
			 	a	b	flag	result
				-4	7	true	3
				-4	7	false	-11
			 
			 * 결론 : 
			 	1. if조건식 자리는 불린표현식이다.  
		
			 	
			 */
		
		   
		
	        
	    }
	}



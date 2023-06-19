package programmersCodingTest.codingTest.level0;



public class 홀짝에_따른_다른_값_반환하기 {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 != 0){
             for (int i = 0; i <= n; i++){
                if (i % 2 != 0) {
                answer += i;
                }//if end
             }//for end
        }else if (n % 2 == 0){
              for (int i = 0; i <= n; i++){
                if (i % 2 == 0) { 
                answer += i*i;
                }//if end
             }//for end              
        }//if end

        return answer;
    }//
    
	public static void main(String[] args) {
			/*
			 
			 
			 * 문제실행 : 
			 	양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
			 	n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
			 				
			 * 입출력 : 
				n	result
				7	16
				10	220
			 
			 * 결론 : 
			 	1. 홀수 
			 		n % 2 != 0
				2. 짝수
			 		n % 2 == 0
			 */
		
		   
		
	        
	    }
	}



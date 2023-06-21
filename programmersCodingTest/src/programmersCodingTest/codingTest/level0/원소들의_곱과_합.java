package programmersCodingTest.codingTest.level0;



public class 원소들의_곱과_합 {
	public int solution(int[] num_list) {
        int answer = 0;
        int gop = 1;
        int hap = 0;   
        
         
        //모든 원소들의 곱
        for (int i = 0; i < num_list.length; i++) {
			hap += num_list[i];
            gop *= num_list[i];
		}//for end
        int haphap = hap*hap; 
        
        /*
        모든 원소들의 합의제곱
        for (int i = 0; i < num_list.length; i++) {
			//이렇게 가능?
            //hap += num_list[i];
            //hap = answer *answer;
            hap += num_list[i];
            haphap = hap*hap;            
		}//for end
        */
        
        answer = (gop < haphap) ? 1 : 0 ;

        
        return answer;
    }
	
	public static void main(String[] args) {
			/*
			 
			 * 문제실행 :
			 	정수가 담긴 리스트 num_list가 주어질 때, 
			 	모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
			 				
			 * 입출력 :  
			 	num_list		result
				[3, 4, 5, 2, 1]	1
				[5, 7, 8, 3]	0
				
			 * 결론 : 
			 	1. 배열 모든 원소 합/ 곱
			 		int gop = 1;
        			int hap = 0;
        			 for (int i = 0; i < num_list.length; i++) {
						hap += num_list[i];
			            gop *= num_list[i];
					}//for end
				
				2.
				public int solution(int[] num_list) {
			        int answer = 0;
			
			        int sum  = 0;
			        int mult = 1;
			
			        for(int i : num_list) {
			            sum += i;
			            mult *= i;
			        }
			
			        answer = Math.pow(sum,2) > mult ? 1 : 0;
			
			        return answer;
			    }
			 	
			 */
		
		   
		
	        
	    }
	}



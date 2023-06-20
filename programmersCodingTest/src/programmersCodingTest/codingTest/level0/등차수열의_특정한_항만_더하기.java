package programmersCodingTest.codingTest.level0;



public class 등차수열의_특정한_항만_더하기 {
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        /*
        배열에서 1번에 a를 넣고 다음으로 a +d = c c+d=e... -> c += a+d
            //불린 배열에 값을 넣을 수 없다.
        만약 불린절이 true라면 그 값을 더해
        
        int firstTerm = 1;  // 첫 번째 항
        int difference = 2; // 공차
        int numberOfTerms = 5; // 항의 개수
        
        */
        for (int i = 0; i < included.length; i++) {
            if(included[i]){
            answer += a + (i * d);
            }//if end
        }

        return answer;
    }//
	
	public static void main(String[] args) {
			/*
			 
			 * 문제실행 : 
			 	두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
			 	첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
			 	이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 
			 	solution 함수를 작성해 주세요.
			 				
			 * 입출력 :  
			 	a	d	included											result
				3	4	[true, false, false, true, true]					37
				7	1	[false, false, false, true, false, false, false]	10
			 
			 * 결론 : 
			 	1.  등차수열
			 		int start = 1;  // 시작 값
					int diff = 3;  // 등차(증가 값)
					int length = 10;  // 수열의 길이
					
					int[] sequence = new int[length];
					
					for (int i = 0; i < length; i++) {
					    sequence[i] = start + (diff * i);
					}
			 	
			 	2. 
			 	return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
			 		
			 
			 	
			 */
		
		   
		
	        
	    }
	}



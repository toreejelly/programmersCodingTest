package programmersCodingTest.codingTest.level0;


public class 더_크게_합치기 {

	public static void main(String[] args) {
			/*
			 
			 * 
			 
			 * 문제실행 : 
			 * 제한사항 : 
						
			 * 입력 : 
			 * 출력 : 
			 
			 * 결론 : 
			 	1.  
			 		
				2. 
			 	
			 */
		int a = 10;
		int b = 20;
	    int answer = 0;
		int comAB = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int comBA = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
		   
		System.out.println(comAB);
		System.out.println(comBA);
		
		if(comAB > comBA){
            answer += comAB;
		}else if(comAB < comBA) {
			answer += comBA;	
		}else {
			answer += comAB;	
        }//if end
		
		System.out.println(answer);     
	       
	}   
	}



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
			 	1. 삼항연산자
			 	   조건식 ? 참인 경우의 값 : 거짓인 경우의 값
			 	   int a = (5<4) ? 50:40;
			 	   
			 	   int a;
			 	   if(5<4){
			 	   a=50;
			 	   }else{
			 	   a=40;
			 	   };
			 		
				2. 
			 	
			 */
		int a = 10;
		int b = 20;
	    int answer = 0;
		int comAB = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int comBA = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        /*
        String temp1 = "" + a + b;
        String temp1 = String.valueOf(a) +  Integer.toString(b);
        String temp2 = "" + b + a;
        
        int ab = Integer.parseInt(temp1);
        int ab = Integer.valueOf(temp1);
        int ba = Integer.parseInt(temp2);
        
        */
        
		System.out.println(comAB);
		System.out.println(comBA);
		
		//							조건문                   
		int an = (comAB > comBA) ? (comAB < comBA) ? comBA :comAB : comBA ; 
				 //조건문			//(true                          )  (false)
		if(comAB > comBA){
            answer += comAB;
		}else if(comAB < comBA) {
			answer += comBA;	
		}else {
			answer += comAB;	
        }//if end
		
		System.out.println(answer);  
		System.out.println(an);
	       
	}   
	}



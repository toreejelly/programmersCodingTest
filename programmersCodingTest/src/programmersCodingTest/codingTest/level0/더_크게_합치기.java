package programmersCodingTest.codingTest.level0;


public class ��_ũ��_��ġ�� {

	public static void main(String[] args) {
			/*
			 
			 * 
			 
			 * �������� : 
			 * ���ѻ��� : 
						
			 * �Է� : 
			 * ��� : 
			 
			 * ��� : 
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



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
			 	1. ���׿�����
			 	   ���ǽ� ? ���� ����� �� : ������ ����� ��
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
		
		//							���ǹ�                   
		int an = (comAB > comBA) ? (comAB < comBA) ? comBA :comAB : comBA ; 
				 //���ǹ�			//(true                          )  (false)
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



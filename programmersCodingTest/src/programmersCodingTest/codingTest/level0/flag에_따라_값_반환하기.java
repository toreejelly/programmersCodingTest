package programmersCodingTest.codingTest.level0;



class flag��_����_��_��ȯ�ϱ� {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        // return flag ? a + b : a - b;
        
        //if ������ boolean(����.��) ǥ�����̾�� �մϴ�. 
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
			 
			 * �������� : 
			 	�� ���� a, b�� boolean ���� flag�� �Ű������� �־��� ��, 
			 	flag�� true�� a + b�� false�� a - b�� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
			 
			 * ����� :  
			 	a	b	flag	result
				-4	7	true	3
				-4	7	false	-11
			 
			 * ��� : 
			 	1. if���ǽ� �ڸ��� �Ҹ�ǥ�����̴�.  
		
			 	
			 */
		
		   
		
	        
	    }
	}



package programmersCodingTest.codingTest.level0;



public class Ȧ¦��_����_�ٸ�_��_��ȯ�ϱ� {
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
			 
			 
			 * �������� : 
			 	���� ���� n�� �Ű������� �־��� ��, n�� Ȧ����� n ������ Ȧ���� ��� ���� ������ ���� return �ϰ� 
			 	n�� ¦����� n ������ ¦���� ��� ���� ������ ������ ���� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
			 				
			 * ����� : 
				n	result
				7	16
				10	220
			 
			 * ��� : 
			 	1. Ȧ�� 
			 		n % 2 != 0
				2. ¦��
			 		n % 2 == 0
			 */
		
		   
		
	        
	    }
	}



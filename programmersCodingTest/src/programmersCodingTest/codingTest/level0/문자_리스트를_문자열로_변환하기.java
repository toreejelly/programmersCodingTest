package programmersCodingTest.codingTest.level0;


public class ����_����Ʈ��_���ڿ���_��ȯ�ϱ� {
	public static String solution(String[] arr) {
        String answer = "";
        
        for(int i=0;  i<arr.length; i++){
            answer += arr[i];
        }//for end
        
        return answer;
    }//solution end
	
	
	
	public static void main(String[] args) {
			
		
			/*
			 
			 * 
			 
			 * �������� : ���ڵ��� ����ִ� �迭 arr�� �־����ϴ�. 
			 			arr�� ���ҵ��� ������� �̾� ���� ���ڿ��� return �ϴ� solution�Լ��� �ۼ��� �ּ���.
		
			 * ����� : arr	             result
					  ["a","b","c"]	     "abc"

			 * ��� : 
			 	1. �迭 ���� ���� 
			 		�����̸�.length
			 		
				2. �迭 ���
					�����̸�[�ε��� ��ȣ]

			 */
		
		   
		String[] arr = {"a", "b", "c"}; // �迭�̶�� ["a", "b", "c"] �̷��� �����ؼ��� �ȵȴ�.  
		solution(arr);
	        
	    }
	}//class end



package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class ���ڿ�_���ľ��� {

	
			/*
			 
			 * ���ڿ�_���ľ���
			 
			 * �������� : ���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. 
			 		    ���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� 
			 		    ���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���. 
		
						
			 * ����� : my_string	      overwrite_string	s	result
					 "He11oWor1d"	  "lloWorl"	        2	"HelloWorld"
					 "Program29b8UYP"  "merS123"	        7	"ProgrammerS123"

			 
			 * ��� : 
			 	1. �迭
			 	  Ÿ��[]�����̸� = newŸ��[����];
			 	  int[] num = new int[4];
			 	  ���̰� 4�� �迭�� �ε��� ������ 0,1,2,3
			 	  num[3]=50; -> �迭 num�� 4��° ��ҿ� 50�� �����Ѵ�.
			 	  int i = num[3]; -> �迭 num�� 4��° ����� ���� i�� �����Ѵ�. 
			 		
				2. public String substring(startIndex) -> startIndex���� �������� ���ڿ��� ���� 
				   str.substring(2) ->  String str = "hello";  -> llo
				   
				   public String substring(startIndex, endIndex) -> startIndex(����)���� endIndex(������)������ ���ڿ��� ����
				   str.substring(2,4) ->  String str = "hello";  -> ll
			 	
			 */
		
		class Solution {
		    public String solution(String my_string, String overwrite_string, int s) {
		        String answer = "";
		        answer = my_string.substring(0,s) + overwrite_string 
		                 + my_string.substring(overwrite_string.length() + s); 
		        
		        return answer;
		    }
		}
		    
		class Solution1 {
		    public String solution(String my_string, String overwrite_string, int s) {
		        // �ڵ� ������ ��������� Ǯ�� �ȴ�. �Ʒ� main �� �� ������ �س��� ��
		        String temp1 = my_string.substring(0, s);
		        String temp2 = my_string.substring(overwrite_string.length() + s);
		        String answer = temp1 + overwrite_string + temp2;
		        return answer;
		        }
		}
		
}
   
	    
	



package programmersCodingTest.codingTest.level0;

class Solution {
    public String solution(String str1, String str2) {
  //����	   returnŸ�� �Լ��̸� �Ķ����       �Ķ����
    	String answer = "";
        
        for(int i = 0; i<str1.length(); i++) {

            // answer += (str1.charAt(i) + "");
            // answer += (str2.charAt(i) + "");
        	
        	// "" �� �� ������� 
            answer += (str1.charAt(i) + "" + str2.charAt(i));
            //         Ÿ�� char         Ÿ���� String���� ��ȯ������
            
            //2)
            // answer += (str1.charAt(i) + str2.charAt(i));
          
        }//for end
        
        
        return answer ;
        
        //2)
        //return answer + "" ;
    }//solution end
} //class end




public class ���ڿ�_���� {

	/* 
	 
	 * ���ڿ�_����
	 
	 * �������� : ���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.
				�� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� ����� 
				return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
				
	 * ����� : str1		 str2	 result
			  "aaaaa"	"bbbbb"	 "ababababab" 
	 
	 * ��� : 
	 	1. �޼ҵ� ���� �� ȣ��
	 		
	 	
	 */
	
	//private static void Solution(String string, String string2) {
		// TODO Auto-generated method stub
		
	//}

    public static String solution(String str1, String str2) {
  //����	          returnŸ�� �Լ��̸� �Ķ����       �Ķ����
  //       class�ȿ� �Լ� ���� ����Ϸ��� static ����ؾ��Ѵ�  	
    	String answer = "";
        
        for(int i = 0; i<str1.length(); i++) {

            // answer += (str1.charAt(i) + "");
            // answer += (str2.charAt(i) + "");
        	
        	// "" �� �� ������� 
            answer += (str1.charAt(i) + "" + str2.charAt(i));
            //         Ÿ�� char         Ÿ���� String���� ��ȯ������
            
            //2)
            // answer += (str1.charAt(i) + str2.charAt(i));
          
        }//for end
        
        
        return answer ;
        
        //2)
        //return answer + "" ;
    }//solution end
	
	public static void main(String[] args) {
		
		//Solution("aaaaa","bbbbb");
		
		
		//���ڿ�_���ľ��� ���� = new ���ڿ�_���ľ���();
		// 1.
		Solution so = new Solution();
		System.out.println(so.solution("aaaaa", "bbbbb"));   
		//so.solution("aaaaa", "bbbbb");
		String a = so.solution("aaaaa", "bbbbb");
		System.out.println(a);
		
		//2.
		solution("aaaaa", "bbbbb");
		System.out.println(solution("aaaaa", "bbbbb"));
		String b = solution("aaaaa", "bbbbb");
		System.out.println(b);
		
	        
	    }//

	
	}//class end



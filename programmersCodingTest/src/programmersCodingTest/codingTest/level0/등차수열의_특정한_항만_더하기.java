package programmersCodingTest.codingTest.level0;



public class ����������_Ư����_�׸�_���ϱ� {
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        /*
        �迭���� 1���� a�� �ְ� �������� a +d = c c+d=e... -> c += a+d
            //�Ҹ� �迭�� ���� ���� �� ����.
        ���� �Ҹ����� true��� �� ���� ����
        
        int firstTerm = 1;  // ù ��° ��
        int difference = 2; // ����
        int numberOfTerms = 5; // ���� ����
        
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
			 
			 * �������� : 
			 	�� ���� a, d�� ���̰� n�� boolean �迭 included�� �־����ϴ�. 
			 	ù°���� a, ������ d�� ������������ included[i]�� i + 1���� �ǹ��� ��, 
			 	�� ���������� 1�׺��� n�ױ��� included�� true�� �׵鸸 ���� ���� return �ϴ� 
			 	solution �Լ��� �ۼ��� �ּ���.
			 				
			 * ����� :  
			 	a	d	included											result
				3	4	[true, false, false, true, true]					37
				7	1	[false, false, false, true, false, false, false]	10
			 
			 * ��� : 
			 	1.  ��������
			 		int start = 1;  // ���� ��
					int diff = 3;  // ����(���� ��)
					int length = 10;  // ������ ����
					
					int[] sequence = new int[length];
					
					for (int i = 0; i < length; i++) {
					    sequence[i] = start + (diff * i);
					}
			 	
			 	2. 
			 	return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
			 		
			 
			 	
			 */
		
		   
		
	        
	    }
	}



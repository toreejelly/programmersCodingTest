package programmersCodingTest.codingTest.level0;



public class ���ҵ���_����_�� {
	public int solution(int[] num_list) {
        int answer = 0;
        int gop = 1;
        int hap = 0;   
        
         
        //��� ���ҵ��� ��
        for (int i = 0; i < num_list.length; i++) {
			hap += num_list[i];
            gop *= num_list[i];
		}//for end
        int haphap = hap*hap; 
        
        /*
        ��� ���ҵ��� ��������
        for (int i = 0; i < num_list.length; i++) {
			//�̷��� ����?
            //hap += num_list[i];
            //hap = answer *answer;
            hap += num_list[i];
            haphap = hap*hap;            
		}//for end
        */
        
        answer = (gop < haphap) ? 1 : 0 ;

        
        return answer;
    }
	
	public static void main(String[] args) {
			/*
			 
			 * �������� :
			 	������ ��� ����Ʈ num_list�� �־��� ��, 
			 	��� ���ҵ��� ���� ��� ���ҵ��� ���� �������� ������ 1�� ũ�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
			 				
			 * ����� :  
			 	num_list		result
				[3, 4, 5, 2, 1]	1
				[5, 7, 8, 3]	0
				
			 * ��� : 
			 	1. �迭 ��� ���� ��/ ��
			 		int gop = 1;
        			int hap = 0;
        			 for (int i = 0; i < num_list.length; i++) {
						hap += num_list[i];
			            gop *= num_list[i];
					}//for end
				
				2.
				public int solution(int[] num_list) {
			        int answer = 0;
			
			        int sum  = 0;
			        int mult = 1;
			
			        for(int i : num_list) {
			            sum += i;
			            mult *= i;
			        }
			
			        answer = Math.pow(sum,2) > mult ? 1 : 0;
			
			        return answer;
			    }
			 	
			 */
		
		   
		
	        
	    }
	}



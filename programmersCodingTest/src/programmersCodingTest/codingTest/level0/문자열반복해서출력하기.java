package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class ���ڿ��ݺ��ؼ�����ϱ� {

	public static void main(String[] args) {
			/*
			 
			 * ���ڿ� �ݺ��ؼ� ����ϱ�
			 
			 * �������� : ���ڿ� str�� ���� n�� �־����ϴ�. str�� n�� �ݺ��� ���ڿ��� ����� ����ϴ� �ڵ带 �ۼ��� ������.
			 * ���ѻ��� : 1 �� str�� ���� �� 10
						1 �� n �� 5
						
			 * �Է� : string 5
			 * ��� : stringstringstringstringstring
			 
			 ��� : 
			 	1. �ݺ��� 
			 		for(int i=0(�ʱ�ȭ); i<10(���ǽ�); i++(������) {
   					//������ ���� ��� for�� ���� ���� 
					}
				2. ���ѻ��� �� ������ Ȯ��
			 	
			 */
		
		   	Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = sc.nextInt();
	        
	        if(str.length()>=1 && str.length()<=10){
	           if(n>=1 && n<=5){ 
	                for(int i=1; i<=n; i++){
	                    System.out.print(str);
	                }//for end
	            }//if end
	        }//if end  
	        
	    }
	}



package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class ���ڿ������� {

	public static void main(String[] args) {
			/*
			 
			 * ���ڿ� ������
			  
			 * �������� : ���ڿ� str�� �־����ϴ�.
					    ���ڿ��� �ð�������� 90�� ������ �Ʒ� ����� ���� ���� ����ϴ� �ڵ带 �ۼ��� ������.
			 * ���ѻ��� : 
						
			 * �Է� : abcde
			 * ��� : a
					 b
					 c
					 d
					 e
			 
			 * ��� : 
			 	1.str.charAt(i) : string Ÿ������ ���� ���ڿ��� char Ÿ������ �� ���ڸ� �޴� �Լ� 
			 		
				2. 
			 	
			 */
		
			Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        
	        for(int i=0; i<str.length(); i++){
	            System.out.println(str.charAt(i));
	        }//for end.
		
	        
	    }
	}



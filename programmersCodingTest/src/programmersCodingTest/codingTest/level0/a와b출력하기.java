package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class a��b����ϱ� {

	public static void main(String[] args) {
			/*
			 
			 * a�� b ����ϱ�
			 
			 * �������� : ���� a�� b�� �־����ϴ�. �� ���� �Է¹޾� ����� ���� ���� �������� ����ϴ� �ڵ带 �ۼ��� ������.
			 * ���ѻ��� : -100,000 �� a, b �� 100,000
						
			 * �Է� : 4 5
			 * ��� : a = 4
					 b = 5		
			 
			 ��� : 
			 	1. ������ : <= , >= , == , != , &&(and) , ||(or)
			 	
			 */
		
		
		 Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();

	     if(a>=-100000 && b<=100000){
	         System.out.println("a = " + a);
	         System.out.println("b = " + b);
	       }//

	}

}

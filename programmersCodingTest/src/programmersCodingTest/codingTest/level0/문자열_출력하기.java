package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class ���ڿ�_����ϱ� {

	public static void main(String[] args) {
		/*
		 
		 * ���ڿ� ����ϱ�
		 
		 * �������� : ���ڿ� str�� �־��� ��, str�� ����ϴ� �ڵ带 �ۼ��� ������.
		 * ���ѻ��� : 1 �� str�� ���� �� 1,000,000
					str���� ������ ������, ù° �ٿ� �� �ٷθ� �־����ϴ�.
		 * �Է� : HelloWorld!
		 * ��� : HelloWorld!			
		 
		 ��� : 
		 	1. >= �� <= �ݴ�� ���� �ȵ�. ũ�ų� ���� �۰ų� ���� �̷� ���̾�� ��.
		 	2. System.out.print		: ����� ������ ��� ����
		 	   System.out.println	: ����� ���� ��. ����� ������ ����
		 	3. str.length();		: str�� ���ڱ��� ���ϱ�
		 	4. ���ǹ�
		 		if(���ǽ�1){
		 		���ǽ�1�� ���̸� ����
		 		}else if(���ǽ�2){
		 		���ǽ�1�� �����̰� ���ǽ�2�� ���̸� ����
		 		}else{
		 		���ǽ� 1,2�� �����̸� ����
		 		}//if end
		 */
		
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      
        if(str.length()>=1 && str.length()<=1000000){
          System.out.print(str);
        }//if end
	
	}

}

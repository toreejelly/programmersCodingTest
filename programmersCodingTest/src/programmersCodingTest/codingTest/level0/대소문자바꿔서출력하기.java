package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class ��ҹ��ڹٲ㼭����ϱ� {

	public static void main(String[] args) {
			/*
			 
			 * ��ҹ��ڹٲ㼭����ϱ�
			 
			 * �������� : ���� ���ĺ����� �̷���� ���ڿ� str�� �־����ϴ�. �� ���ĺ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� 
			  			�빮�ڷ� ��ȯ�ؼ� ����ϴ� �ڵ带 �ۼ��� ������.


			 * ���ѻ��� : 
						
			 * �Է� : aBcDeFg
			 * ��� : AbCdEfG
			 
			 ��� : 
			 	1.  Character.isUpperCase()�� ��� �빮������ �����ؼ� true false ���� ����
					Character.isLowerCase()�� ��� �ҹ������� �����ؼ� true false ���� ����
					Character.isDigit()�� ��� �������� �����ؼ� true false ���� ���� 
			 		
				2. 
			 	
			 */
		
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        
        //������ �迭�� �ٲ㼭 �ؾ��ϴ°�?
        //for()�ȿ� ���� �� ���� ��?� �� ���°���?
        for(char b : str.toCharArray()){
            if(Character.isLowerCase(b)){
                result += Character.toUpperCase(b);
            }else{
                result += Character.toLowerCase(b);
            }//if end
        }//for end
        
        System.out.print(result);
		   
		
	        
	    }
	}



package ex01;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int r = i % 2;
		
		switch(r){
			case 0:
			System.out.println("¦���Դϴ�.");
				break;
			case 1:
			System.out.println("Ȧ�� �Դϴ�.");
				break;
			default:
				System.out.println("�𸣰ڽ��ϴ�.");
				break;
		}
	}
	
}
	
	



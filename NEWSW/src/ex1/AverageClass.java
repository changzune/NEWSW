package ex1;

import java.util.Scanner;

public class AverageClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		int kor = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int eng = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int met = scanner.nextInt();
		
		double avg = (kor+eng+met) / 3;
		System.out.println("��������� "+ avg + "�Դϴ�.");
		
		if(kor > avg) {
			System.out.println("���� ������ ��� �������� �����ϴ�.");
		}else if(kor < avg) {
			System.out.println("���� ������ ��� �������� �����ϴ�.");
		}else {
			System.out.println("���������� ��� ���� �Դϴ�.");
		}
		
		
		
	}

	
}

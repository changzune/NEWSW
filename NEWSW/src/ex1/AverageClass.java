package ex1;

import java.util.Scanner;

public class AverageClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int met = scanner.nextInt();
		
		double avg = (kor+eng+met) / 3;
		System.out.println("평균점수는 "+ avg + "입니다.");
		
		if(kor > avg) {
			System.out.println("국어 점수는 평균 점수보다 높습니다.");
		}else if(kor < avg) {
			System.out.println("국어 점수는 평균 점수보다 낮습니다.");
		}else {
			System.out.println("국어점수는 평균 점수 입니다.");
		}
		
		
		
	}

	
}

package ex1;

public class Sumfor {
	
	public static void main(String[] args) {
		int j = 11;
		int sum = 0;
		for (int i = 1; i < j; i++) {
			int h = i%2;
			if(h==1) {
				sum = sum + i;
			}
			
		}
		
		System.out.println(sum);
		
		
	}

}

package ex1;

public class Calculator {
	public Calculator() {
	
	}

	public static int add(int x, int y) throws õ��_�Ѵ�_���� {
		
		int result = x + y;
		if(result > 1000)
			throw new õ��_�Ѵ�_����();
			
		
		return x+y;
		
	}

	public static int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	public static int multi(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	public static int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}

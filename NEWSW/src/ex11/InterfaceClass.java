package ex11;

public class InterfaceClass implements InterfaceEx, InterfaceEx2 {

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스입니다.");
		return null;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스2입니다.");
	}

}

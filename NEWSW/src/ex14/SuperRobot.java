package ex14;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		System.out.println("날수 있습니다.");
		
	}

	@Override
	public void actionMisail() {
		System.out.println("미사일 쏠 수 있습니다.");
		
	}

	@Override
	public void actionKnife() {
		System.out.println("레이저검이 있습니다.");
		
	}

	
}

package ex14;

public class LowRobot extends Robot {
	public LowRobot() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionFly() {
		System.out.println("날 수 없습니다.");

	}
	@Override
	public void actionMisail() {
		System.out.println("미사일을 쏠 수 없습니다.");

	}
	@Override
	public void actionKnife() {
		System.out.println("검이 없습니다.");

	}
	

	

}

package ex14;

public abstract class Robot {

	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �ֽ��ϴ�.");

	}
	
	public void actionrun() {
		System.out.println("�޸� �� �ֽ��ϴ�.");

	}
	public void shape() {
		System.out.println("SuperRobot �Դϴ�. ������ ��,�ٸ�,����,�Ӹ��� �ֽ��ϴ�.");

	}

	
	public abstract void actionFly();
	public abstract void actionMisail();
	public abstract void actionKnife();
}

package ex14;

import ex15.FlyYes;
import ex15.KnifeLazer;
import ex15.MisailYes;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("���۷κ��� ������ּ���");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionrun();
		superRobot.actionWalk();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();

	}

}
